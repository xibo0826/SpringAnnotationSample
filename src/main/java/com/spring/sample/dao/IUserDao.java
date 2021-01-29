package com.spring.sample.dao;

import com.spring.sample.domain.User;

import java.util.List;

public interface IUserDao {

    List<User> findAll();

    User findById(String userId);

    void save(User user);

    void delete(String userId);
}
