package com.tms.dao;

import com.tms.entity.User;
import com.tms.entity.UserRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class UserDao implements IUserDao {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<User> findAll() {
        String sql = "SELECT * FROM user";
        return jdbcTemplate.query(sql, new UserRowMapper());
    }

    @Override
    public void createUser(User user) {
        String sql = "INSERT INTO user(login, password, username) VALUE (?, ?, ?)";
        jdbcTemplate.update(sql, user.getLogin(), user.getPassword(), user.getUsername());
    }


    @Override
    public User checkUser(String login)  {
        String sql = "SELECT * FROM user WHERE login=?";
        try{
            return jdbcTemplate.queryForObject(sql, new UserRowMapper(), login);
        }catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
}
