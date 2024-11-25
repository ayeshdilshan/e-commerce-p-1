package com.example.e_commerce_proj_1.dto;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class CommonResponse {

    private HttpStatus status;
    private String message;
    private Object data;
}
