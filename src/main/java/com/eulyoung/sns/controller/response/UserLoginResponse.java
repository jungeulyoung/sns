package com.eulyoung.sns.controller.response;

import com.eulyoung.sns.model.User;
import com.eulyoung.sns.model.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserLoginResponse {

    private String token;

}
