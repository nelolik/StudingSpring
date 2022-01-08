package com.nelolik.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FirsController  {

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model) {
//        System.out.println("Hello " + name + " " + surname);
        model.addAttribute("message", "Hello " + name + " " + surname);

        return "first/hello";
    }

    @GetMapping("/calculator")
    public String calculator(HttpServletRequest request,
                             Model model) {
        String a = request.getParameter("a");
        String b = request.getParameter("b");
        String action = request.getParameter("action");
        String answer = calcResult(a, b, action);

        model.addAttribute("message", "Result is " + answer);

        return "first/hello";
    }


    private String calcResult(String a, String b, String action) {
        if (a == null || b == null || action == null) {
            return "missing args";
        }
        try {
            Integer ai = Integer.parseInt(a);
            Integer bi = Integer.parseInt(b);
            switch (action) {
                case "mult":
                    return "" + (ai * bi);
                case "div":
                    return "" + (ai / bi);
                case "add":
                    return "" + (ai + bi);
                case "sub":
                    return "" + (ai - bi);
                default:
                    return "wrong operator";
            }
        } catch (NumberFormatException e) {
            return "arguments are not integers";
        }
    }

    @GetMapping("/goodbye")
    public String goodByePage() {
        return "first/goodbye";
    }
}
