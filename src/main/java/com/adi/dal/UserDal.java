package com.adi.dal;
/*
 * @author: aditya10.kumar
 * @created: 05/08/19
 */

import com.adi.entity.User;
import com.adi.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserDal implements AbstractDalLayer<User,Integer> {
    @Autowired
    private UserRepo userRepo;

    @Override
    public User findById(Integer id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}

