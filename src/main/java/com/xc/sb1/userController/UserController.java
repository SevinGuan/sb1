package com.xc.sb1.userController;


import com.xc.sb1.entity.User;
import com.xc.sb1.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;




@RestController
public class UserController {



    @Autowired
    IUserService  iUserService;

    @GetMapping("{sid}")
    public User getById(@PathVariable("sid")  Long id){
         System.out.println("id:=" + id);
        System.out.println("查询操作");


        return iUserService.getById(id);

    }

}


