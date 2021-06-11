package com.jiwei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloAnnotationController {

    @RequestMapping("/h1")
    public String helloAnnotation(Model model) {

        model.addAttribute("msg", "Hello SpringMVC Annotation");

        return "helloAnnotation"; //会被视图解析器处理 找到 /WEB-INFO/jsp/helloAnnotation.jsp
    }

}
