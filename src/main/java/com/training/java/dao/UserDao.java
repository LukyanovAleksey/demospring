package com.training.java.dao;

import com.training.java.entity.User;

import java.util.List;

/**
 * UserDao.
 *
 * @author Aleksey_Lukyanov
 */
public interface UserDao {

    List<User> findAll();

}
