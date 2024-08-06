package com.teamprj.web.team5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/haneulwalk")
public class HomeController {
    
    @GetMapping("index")
    public String homeIndex(){
        return "HaneulWalk/index";
    }
    
    @GetMapping("category")
    public String category(){
        return "HaneulWalk/category";
    }
    @GetMapping("contest/create")
    public String contestCreate(){
        return "HaneulWalk/contest/create";
    }
    @GetMapping("diary/index")
    public String diary(){
        return "HaneulWalk/diary/index";
    } 
}