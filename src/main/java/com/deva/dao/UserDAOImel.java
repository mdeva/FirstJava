/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deva.dao;

import com.deva.model.User;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author deverajan
 */
@Transactional
@Repository
public class UserDAOImel implements UserDAO {

    @Autowired(required = true)
    private SessionFactory sessionFactory;

    @Override
    public int addUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        Long id = (Long) session.save(user);
        return Integer.valueOf(id.toString());
    }

    @Override
    public List<User> userList() {
System.out.println("---- DAO userList");
        return sessionFactory.getCurrentSession()
                .createQuery("from User")
                .list();

    }

}
