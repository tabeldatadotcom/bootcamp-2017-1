package com.tabeldata.http.server.controller;

import com.tabeldata.http.server.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class IndexController {

    private Logger console = LoggerFactory.getLogger(IndexController.class);

    @GetMapping(value = "/sayHalo")
    public User index() {
        return new User(
                "dimMaryanto93",
                UUID.randomUUID().toString());
    }

    @GetMapping(value = "/user/new")
    public void getAnUser(@ModelAttribute User anUser) {
//  ini cara lama
// request.getParameter("username");
        console.info("username: {}, password: {}", anUser.getUsername(), anUser.getPassword());
    }
}
