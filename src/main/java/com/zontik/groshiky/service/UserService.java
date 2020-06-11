package com.zontik.groshiky.service;

import com.zontik.groshiky.dao.IUserDao;
import com.zontik.groshiky.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService implements IUserService{

    @Autowired
    private IUserDao userDao;

    @Override
    public void createUser(User user) {
        userDao.createUser(user);
    }
}
