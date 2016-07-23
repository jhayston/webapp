package com.gordianinnovation.com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 7/22/2016.
 */

@Controller
public class HelloWorldController {

   @RequestMapping("/")
    public String sayHello() {
       return "index";
   }
}
