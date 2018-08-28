package com.enoxs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {
    @RequestMapping(value = "/WebHome/index",method = RequestMethod.GET)
    public String index(){
        return "index";
    }
    @RequestMapping(value = "/WebHome/redirect",method = RequestMethod.GET)
    public String redirect(){
        return "redirect:finalPage";
    }
    @RequestMapping(value = "/WebHome/finalPage",method = RequestMethod.GET)
    public String finalPage(){
        return "final";
    }

    @RequestMapping(value = "/WebHome/staticPage", method = RequestMethod.GET)
    public String redirect2() {
        return "redirect:/pages/final.html";
    }

}
