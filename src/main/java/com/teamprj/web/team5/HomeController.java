package com.teamprj.web.team5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
    
    @GetMapping("haneulwalk/index")
    public String homeIndex(){
        return "HaneulWalk/index";
    }

    @GetMapping("gallery")
    public String gallery(){
        return "HaneulWalk/gallery/index";
    }
    
<<<<<<< HEAD
    @GetMapping("guide")
    public String guide(){
        return "HaneulWalk/gallery/guide";
=======
    @GetMapping("haneulwalk/category")
    public String category(){
        return "HaneulWalk/category";
>>>>>>> aec75bd985051643da420e2fc8a68eaee91dccc3
    }
}
