package com.tms.controller;

import com.tms.entity.User;
import com.tms.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap model) {
        model.addAttribute("message", "Welcome to the project Groshiky");
        return "index";
    }
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView getLogin(Model model) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userOb", new User());
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView checkUser(@ModelAttribute("userOb") User user, ModelMap model) {
        User user1 = userService.checkUser(user.getLogin(), user.getPassword());

        if (user1 == null) {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.addObject("userOb", new User());
            modelAndView.setViewName("incorrect");
            return modelAndView;

        } else {
            ModelAndView modelAndView3 = new ModelAndView();
            modelAndView3.addObject("userOb", new User());
            model.addAttribute("login", user1.getLogin());
            model.addAttribute("password", user1.getPassword());
            model.addAttribute("username", user1.getUsername());
            modelAndView3.setViewName("result");
            return modelAndView3;
        }


    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public ModelAndView user() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userOb", new User());
        modelAndView.setViewName("user");
        return modelAndView;
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("userOb") User user, ModelMap model) {
        model.addAttribute("login", user.getLogin());
        model.addAttribute("password", user.getPassword());
        model.addAttribute("username", user.getUsername());
        userService.createUser(user);
        return "result";
    }




}
