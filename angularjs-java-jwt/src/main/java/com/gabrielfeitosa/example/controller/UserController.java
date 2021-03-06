package com.gabrielfeitosa.example.controller;

import com.gabrielfeitosa.example.domain.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by gabriel on 23/05/17.
 */
@Path("/user")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserController {

    private static List<User> list = new ArrayList(){{
        add(new User("User 1", "123456"));
        add(new User("User 2", "659849"));
        add(new User("User 3", "65498987"));
    }};

    @GET
    public List<User> getAll(){
        return list;
    }

    @POST
    public User save(User user){
        list.add(user);
        return user;
    }
}
