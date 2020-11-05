package com.training.java.dao;

import com.training.java.entity.User;

import java.util.List;

/**
 * UserDao.
 *
 * @author Aleksey_Lukyanov
 */
public interface UserDao {

    void save(User user);

    User getById(int id);

    void delete(int id);

    void update(User user);

    List<User> findAll();

}
