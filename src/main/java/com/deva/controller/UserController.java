/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deva.controller;

import com.deva.model.User;
import com.deva.service.UserService;
import com.google.gson.Gson;
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
public class UserController {

    @Autowired
    private UserService userService;
    User user;

    @RequestMapping(value = "/userList", method = RequestMethod.GET)
    @ResponseBody
    public String sucess() {
        System.out.println("userList");
        List<User> list = userService.userList();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        System.out.println("json" + json);
        return json;
    }

}
