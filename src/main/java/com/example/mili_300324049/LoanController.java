package com.example.mili_300324049;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping
@SessionAttributes("name")
public class LoanController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String display() {

        return "loan-list";
    }
}