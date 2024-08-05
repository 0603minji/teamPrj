package com.teamprj.web.team5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class HomeController {
    @GetMapping("haneulwalk/funeral/list")
    public String home(){
        return "HaneulWalk/funeral/list";
    }
    
}
