package com.demo.controller;

import com.demo.pojo.Team;
import com.demo.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TeamController {
    @Autowired
    private TeamService ts;

    @PostMapping("/change")
    @ResponseBody
    public int updateTeam(Team t){
        return ts.UpdateTeam(t);
    }
    @PostMapping("/add")
    @ResponseBody
    public int addTeam(Team t){
        return ts.addTeam(t);
    }
}
