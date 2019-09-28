package com.stackroute;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class UserController {


    public User user;

    public UserController()
    {
        user = new User("Varun");
    }

    @RequestMapping("/home")
    public ModelAndView show(HttpServletRequest request, HttpServletResponse response)
    {
        ModelAndView m = new ModelAndView();
        m.setViewName("home.jsp");
        m.addObject("name","Varun");
        return m;
    }



}
