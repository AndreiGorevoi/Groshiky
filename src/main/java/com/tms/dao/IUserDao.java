package com.tms.dao;

import com.tms.entity.User;

import java.util.List;

public interface IUserDao {
    List<User> findAll();

    void createUser(User user);

    User checkUser(String login);
}
