package com.training.java.service;

import com.training.java.dao.UserDao;
import com.training.java.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserServiceImpl.
 *
 * @author Aleksey_Lukyanov
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserDao userDao;

    public List<User> findAll() {
        return userDao.findAll();
    }

    public void save(User user) {
        userDao.save(user);
    }

    public User getById(int id) {
        return userDao.getById(id);
    }

    public void delete(int id) {
        userDao.delete(id);
    }

    public void update(User user) {
        userDao.update(user);
    }
}
