package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by bsbuon on 1/10/17.
 */
@RestController
@RequestMapping("/users")
public class UserRest {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<User> getAll(){
        return userService.getBy(user -> user.getId() > 1);
    }
}
