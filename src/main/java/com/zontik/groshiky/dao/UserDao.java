package com.zontik.groshiky.dao;

import com.zontik.groshiky.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public class UserDao implements IUserDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void createUser(User user) {
        sessionFactory.getCurrentSession().save(user);
    }
}
