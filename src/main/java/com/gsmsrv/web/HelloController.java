package com.gsmsrv.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/param")
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)
    public String printParam(@RequestParam(value = "p1", required = true, defaultValue = "defaultValue") String param, ModelMap model) {
        model.addAttribute("message", param);
        return "hello";
    }
}