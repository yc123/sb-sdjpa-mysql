package com.yc.service.impl;

import com.yc.entity.User;
import com.yc.repository.UserRepository;
import com.yc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by yc on 2017/6/5.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public void add(User user) {

    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void updateNameById(String name, Long id) {
        userRepository.updateNameById(name,id);
    }

    @Override
    public User findById(Long id) {
       return userRepository.findById(id);
    }

}
