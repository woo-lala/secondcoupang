package com.toanyone.user.user.application.service;


import com.toanyone.user.user.domain.dto.RequestCreateUserDto;
import com.toanyone.user.user.domain.dto.ResponseUserDto;
import com.toanyone.user.user.domain.entity.User;
import com.toanyone.user.user.domain.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public ResponseUserDto signUp(RequestCreateUserDto requestCreateUserDto) {

         userRepository.findUserBySlackId(requestCreateUserDto.getSlackId()).ifPresent(user ->
         { throw new RuntimeException("존재하는 slack Id 입니다. "); });

        User user = User.createUser(requestCreateUserDto.getNickName(), encryptPassword(requestCreateUserDto.getPassword()), requestCreateUserDto.getSlackId(), requestCreateUserDto.getRole());
        userRepository.save(user);

        return new ResponseUserDto(user.getId(), user.getNickName(), user.getPassword(), user.getSlackId(), user.getRole());
    }

    private String encryptPassword(String password) {
        return passwordEncoder.encode(password);
    }
}
