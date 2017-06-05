package com.yc.service;

import com.yc.entity.User;
import com.yc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yc on 2017/6/5.
 */
public interface UserService {

    void add(User user);

    List<User> findAll();

    void deleteAll();

    void updateNameById(String name,Long id);

    User findById(Long id);
}
