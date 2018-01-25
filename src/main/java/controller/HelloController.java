package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import service.IMyService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
@RestController
public class HelloController {

    private IMyService IMyService;

    @Autowired
    public HelloController(IMyService IMyService) {
        this.IMyService = IMyService;
    }

    @GetMapping("/hello")
    public String get() {
        return "hello, i'm a request";
    }

    @PostMapping("/hello")
    public String post() {
        return get();
    }

}