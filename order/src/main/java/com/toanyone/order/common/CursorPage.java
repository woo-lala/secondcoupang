package com.toanyone.order.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class CursorPage<T> {
    private List<T> content; // 조회된 데이터 리스트
    private CursorInfo nextCursor; // 다음 페이지 요청할 때 우리에게 다시 보내야 될 값
    private boolean hasNext; // 다음 페이지 존재 여부
}