package com.eulyoung.sns.fixture;

import com.eulyoung.sns.model.entity.UserEntity;
import javax.persistence.criteria.CriteriaBuilder.In;

public class UserEntityFixture {

    public static UserEntity get(String userName, String password, Integer userId) {
        UserEntity result = new UserEntity();
        result.setId(userId);
        result.setUserName(userName);
        result.setPassword(password);

        return result;
    }
}
