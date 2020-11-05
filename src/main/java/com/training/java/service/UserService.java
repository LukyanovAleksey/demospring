package com.training.java.service;

import com.training.java.entity.User;

import java.util.List;

/**
 * UserService.
 *
 * @author Aleksey_Lukyanov
 */
public interface UserService {

    List<User> findAll();

    void save(User user);

    User getById(int id);

    void delete(int id);

    void update(User user);
}
