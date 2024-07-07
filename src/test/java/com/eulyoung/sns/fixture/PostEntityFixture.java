package com.eulyoung.sns.fixture;

import com.eulyoung.sns.model.entity.PostEntity;
import com.eulyoung.sns.model.entity.UserEntity;
import javax.persistence.criteria.CriteriaBuilder.In;

public class PostEntityFixture {

    public static PostEntity get(String userName, Integer postId, Integer userId) {
        UserEntity user = new UserEntity();
        user.setId(1);
        user.setUserName(userName);

        PostEntity result = new PostEntity();
        result.setUser(user);
        result.setId(postId);

        return result;
    }
}
