package com.utp.edu.pe.melamiserviceBackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserDto {

    private Long id;

    private String username;

    private String status;

    private String password;
}
