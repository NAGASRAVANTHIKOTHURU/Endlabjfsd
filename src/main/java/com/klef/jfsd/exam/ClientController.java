package com.klef.jfsd.exam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ClientController {

    @RequestMapping("/greet")
    public String greet(@RequestParam("username") String username, Model model) {
        model.addAttribute("message", "Hello, " + username + "!");
        return "result";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }

    @RequestMapping("/demo1")
    public String demo1(@RequestParam("age") int age, @RequestParam("country") String country, Model model) {
        model.addAttribute("age", age);
        model.addAttribute("country", country);
        return "demo1";
    }

    @RequestMapping("/demo2/{a}/{b}")
    public String demo2(@PathVariable int a, @PathVariable int b, Model model) {
        model.addAttribute("subtraction", a - b);
        model.addAttribute("division", a / b);
        return "demo2";
    }

    @RequestMapping("/productform")
    public String productForm() {
        return "productform";
    }

    @RequestMapping("/multiplyNumbers")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        model.addAttribute("result", num1 * num2);
        return "multiply";
    }

    @RequestMapping("/reverse")
    public String reverse(@RequestParam("str1") String str1, @RequestParam("str2") String str2, Model model) {
        model.addAttribute("reversed1", new StringBuilder(str1).reverse().toString());
        model.addAttribute("reversed2", new StringBuilder(str2).reverse().toString());
        return "reverse";
    }

    @RequestMapping("/calculate")
    public String calculate(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        model.addAttribute("addition", num1 + num2);
        model.addAttribute("subtraction", num1 - num2);
        return "calculate";
    }
}
