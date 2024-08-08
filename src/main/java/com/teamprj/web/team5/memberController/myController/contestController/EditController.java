package com.teamprj.web.team5.memberController.myController.contestController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/haneulwalk/member/my/contest")
public class EditController {
    @GetMapping("edit1")
    public String myContestEdit1(){
        return "HaneulWalk/member/my/contest/edit1";

    }
    @GetMapping("edit2")
    public String myContestEdit2(){
        return "HaneulWalk/member/my/contest/edit2";
    }

    @GetMapping("list")
    public String myContestList(){
        return "HaneulWalk/member/my/contest/list";
    }
}

