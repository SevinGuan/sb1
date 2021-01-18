package com.xc.sb1.userController;

import com.xc.sb1.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("hello")
    public String hello(Model model){
        model.addAttribute("money",22);
        List<User> list = new ArrayList<>();
        User user1= new User();
        User user2= new User();
        user1.setId(2L);
        user1.setName("cc");
        user2.setId(3L);
        user2.setName("bb");
        list.add(user1);
        list.add(user2);
   model.addAttribute("list",list);
        return  "hello";

    }

    }