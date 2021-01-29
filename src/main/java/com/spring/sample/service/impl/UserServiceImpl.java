package com.spring.sample.service.impl;

import com.spring.sample.dao.IUserDao;
import com.spring.sample.domain.User;
import com.spring.sample.service.IUserService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findById(String userId) {
        return userDao.findById(userId);
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(String userId) {
        userDao.delete(userId);
    }
}
