package com.example.nd;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/")
    public String root() {
        return"redirect:/article/list";
    }
}
