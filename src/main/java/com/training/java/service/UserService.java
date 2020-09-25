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
}
