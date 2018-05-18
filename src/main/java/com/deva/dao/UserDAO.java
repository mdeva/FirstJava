/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deva.dao;

import com.deva.model.User;
import java.util.List;

/**
 *
 * @author deverajan
 */
public interface UserDAO {

    public int addUser(User user);
    public List<User> userList();

}
