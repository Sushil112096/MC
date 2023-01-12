package com.example.USERSERVICE.entity;

import lombok.*;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Apiresponse {
    private String message;

    private Boolean Success;


    private HttpStatus Status;

}
