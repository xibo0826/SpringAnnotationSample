package com.spring.sample.service;

import com.spring.sample.domain.User;

import java.util.List;

public interface IUserService {

    List<User> findAll();

    User findById(String userId);

    void save(User user);

    void update(User user);

    void delete(String userId);
}
