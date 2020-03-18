package com.demo.redis.controller;


import com.demo.redis.model.User;
import com.demo.redis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author chen
 * @since 2020-03-18
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/list")
    public List<User> getAll(){
        return userService.list(null);
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable("id")Integer id){
        return userService.getById(id);
    }

    @PostMapping("/")
    public String add(/*@RequestParam("user")*/User user){
        return userService.save(user)? "save success":"save fail";
    }

    @PutMapping("/")
    public String update(/*@RequestParam("user")*/User user){
        return userService.updateUserById(user)==null ? "update fail":"update success";
    }


    @DeleteMapping("/")
    public String delete(/*@RequestParam("id")*/Integer id){
        return userService.removeById(id)? "delete success":"delete fail";
    }
}

