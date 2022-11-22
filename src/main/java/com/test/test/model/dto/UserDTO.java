package com.test.test.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO extends BaseDTO{
    private Integer userId;

    private String firstName;

    private String lastName;

    private String username;

    private String password;

}
