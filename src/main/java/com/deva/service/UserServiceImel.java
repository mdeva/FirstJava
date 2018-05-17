/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deva.service;

import com.deva.dao.UserDAO;
import com.deva.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author deverajan
 */
@Service
@Transactional
public class UserServiceImel implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public int adduser(User user) {

        return userDAO.addUser(user);
    }

}
