/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deva.service;

import com.deva.model.User;
import java.util.List;

/**
 *
 * @author deverajan
 */
public interface UserService {

    public int adduser(User user);
    public List<User> userList();

}
