package org.example.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(HttpServletRequest request) {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        System.out.println("Hello " + name + " " + surname + " from first");

        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodByePage(@RequestParam(value = "name", required = false) String name,
                              @RequestParam(value = "surname", required = false) String surname,
                              Model model) {

        //System.out.println("Goodbye " + name + " " + surname + " from first");
        model.addAttribute("message", "Goodbye " + name + " " + surname + " from first");

        return "first/goodbye";
    }

    @GetMapping("/calculator")
    public String calculatorPage(@RequestParam("a") int a,
                                 @RequestParam("b") int b,
                                 @RequestParam("action") String action, Model model) {
        String res;
        switch (action) {
            case "multiplication":
                res = a+"*"+b+"="+(a*b);
                break;
            case "addition":
                res = a+"+"+b+"="+(a+b);
                break;
            case "subtraction":
                res = a+"-"+b+"="+(a-b);
                break;
            case "division":
                res = a+"/"+b+"="+(a/b);
                break;
            default:
                res="No such action";
        }

        model.addAttribute("result", res);

        return "first/calculator";
    }
}
