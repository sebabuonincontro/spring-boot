package com.example;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by bsbuon on 1/10/17.
 */
@Service
public class UserService {

    public List<User> getBy(Predicate<User> condition){
        List<User> result = new ArrayList<>();
        for(User user : getAll()){
            if(condition.test(user)){
                result.add(user);
            }
        }
        return result;
    }

    private List<User> getAll(){
        List<User> result = new ArrayList<>();
        result.add(new User(1, "user1"));
        result.add(new User(2, "user2"));
        return result;
    }
}
