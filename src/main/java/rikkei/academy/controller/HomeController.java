package rikkei.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.*;

@Controller
public class HomeController extends HttpServlet {
    @GetMapping("/**")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("hello","Hello world");
        return modelAndView;
    }

}