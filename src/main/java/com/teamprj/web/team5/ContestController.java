package com.teamprj.web.team5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/haneulwalk/contest")
public class ContestController {
    @GetMapping("index")
    public String contestIndex(){
        return "HaneulWalk/contest/index";
    }
    @GetMapping("create")
    public String contestCreate(){
        return "HaneulWalk/contest/create";
    }
    
    @GetMapping("list")
    public String contestList(){
        return "HaneulWalk/contest/list";
    }
}
