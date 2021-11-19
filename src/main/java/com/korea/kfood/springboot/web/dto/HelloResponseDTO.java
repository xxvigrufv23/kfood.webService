package com.korea.kfood.springboot.web.dto;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Data
@Getter
@RequiredArgsConstructor
public class HelloResponseDTO {

    private final String name;
    private final int amount;
}
