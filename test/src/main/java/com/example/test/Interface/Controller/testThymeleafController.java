package com.example.test.Interface.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("")
@RestController
public class testThymeleafController {
    @GetMapping("/index")
    public ModelAndView testGet() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","hello world");
        modelAndView.setViewName("index");
        return modelAndView;
    }


}
