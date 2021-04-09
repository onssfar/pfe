package com.example.demo.message.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;
@Getter
@Setter
public class SignUpForm {

    private String name;

    private String username;

    private String email;

    private String password;

    private Set<String> role;




}
