package com.ecommerce.akinjides.controller;

import com.ecommerce.akinjides.DTO.UserDTO;
import com.ecommerce.akinjides.model.User;
import com.ecommerce.akinjides.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/index")
    public ModelAndView homePage(ModelAndView modelAndView){
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @PostMapping("/index")
    public String userForm(@ModelAttribute("user") User user){
        return "index";
    }
//    @GetMapping("/users")
//    public String listUsers(Model model) {
//        List<UserDTO> users = userService.findAllUsers();
//        model.addAttribute("users", users);
//        return "users-list";

}