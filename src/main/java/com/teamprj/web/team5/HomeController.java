package com.teamprj.web.team5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
    
    @GetMapping("haneulwalk/index")
    public String homeIndex(){
        return "HaneulWalk/index";
    }

    @GetMapping("haneulwalk/gallery")
    public String gallery(){
        return "HaneulWalk/gallery/index";
    }
    
    @GetMapping("haneulwalk/category")
    public String category(){
        return "HaneulWalk/category";
    }
}
