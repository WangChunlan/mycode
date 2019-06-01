package com.smartpos.controller;

import com.smartpos.domain.User;
import com.smartpos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wangchunlan
 * @ClassName LoginController.java
 * @Description
 * @createTime 2019年03月28日 11:16:00
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private UserService userService;
    @ResponseBody
    @RequestMapping("in")
    public String in(){
        return "Hello world";
    }

    @ResponseBody
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public User get(Long id){
     return   userService.get(id);
    }
}
