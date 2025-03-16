package com.toanyone.store.presentation.dto;

import com.toanyone.store.domain.model.DetailAddress;
import com.toanyone.store.domain.model.Location;
import com.toanyone.store.domain.model.StoreType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
public class StoreCreateRequestDto {
    @NotBlank
    @Size(max = 30)
    private String storeName;
    @NotNull
    private StoreType storeType;
    @NotNull
    private Location location;
    @NotNull
    private DetailAddress detailAddress;
    @NotBlank
    private Long hubId;
    @NotBlank
    private String telephone;
}
