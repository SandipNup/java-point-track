package test.userstore.controller;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import test.userstore.entity.Store;
import test.userstore.entity.User;
import test.userstore.service.UserService;
import test.userstore.shared.dto.UserDto;
import test.userstore.ui.models.request.UserDetailRequestModel;
import test.userstore.ui.models.response.UserResponse;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("users/")
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping(value = "/stores/{id}")
    public Set<Store> getUserStores(@PathVariable long id) {
        return userService.getUserStores(id);
    }

    @GetMapping
    public List<User> getUsers(){

        return userService.getUsers();
    }

    @PostMapping
    public UserResponse postUser(@RequestBody UserDetailRequestModel userDetails){
        // the Front End has ways to create a new user with set number of stores which a
        //user can access.
        UserResponse response = new UserResponse();
        UserDto createdUser = userService.createUser(userDetails);
        BeanUtils.copyProperties(createdUser, response);
        return response;
    }
}
