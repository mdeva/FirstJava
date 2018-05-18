/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deva.controller;

import com.deva.model.User;
import com.deva.service.UserService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.json.JsonObject;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author deverajan
 */
@Controller
public class HomeController {

    @Autowired
    private UserService userService;
    User user;

    @RequestMapping(value = "/")
    public String showIndex() {
        return "index";
    }

    @RequestMapping(value = "/register")
    public String register() {
        return "register";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String addUserRecord(@RequestBody String data) {
        // here you will receive your 
        System.out.println(data);
        JSONObject jObject;
        try {
            jObject = new JSONObject(data);
            user = new User();
            user.setName(jObject.get("name").toString());
            user.setAddress(jObject.get("address").toString());

        } catch (JSONException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }

        int id = userService.adduser(user);

        return "success";
    }

    @RequestMapping(value = "/success")
    public String succ() {
        return "index";
    }

}
