package com.spring.sample.dao.impl;

import com.spring.sample.dao.IUserDao;
import com.spring.sample.domain.User;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements IUserDao {

    @Autowired
    private QueryRunner queryRunner;

    @Override
    public List<User> findAll() {
        try {
            return queryRunner.query("SELECT * FROM USER", new BeanListHandler<User>(User.class));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public User findById(String userId) {
        try {
            return queryRunner.query("SELECT * FROM USER WHERE USER_ID=?", new BeanHandler<User>(User.class), userId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void save(User user) {
        try {
            queryRunner.insert("INSERT INTO USER VALUES(?, ?, ?, ?, ?)", null, user.getUser_id(), user.getUser_name(), user.getSex(), user.getTel(), user.getBirthday());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(String userId) {
        try {
            queryRunner.insert("DELETE FROM USER WHERE USER_ID = ?", null, userId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
