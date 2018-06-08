package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @GetMapping("/")
    public ModelAndView index(@RequestParam("name")String name){
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("name",name);
        return modelAndView;
    }

}
