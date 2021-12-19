package com.demo.controller;

import com.demo.pojo.Team;
import com.demo.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/idx")
public class TeamController {
    @Autowired
    private TeamService ts;

    @PostMapping("/change")
    @ResponseBody
    public int updateTeam(Team t){
        return ts.Update_Team(t);
    }

    @PostMapping("/add")
    @ResponseBody
    public int addTeam(Team t){
        return ts.Add_Team(t);
    }

    @PostMapping("/count")
    @ResponseBody
    public int countScore(Team t){

        return  ts.Count_Score(t);
    }

    @GetMapping("/delete")
    @ResponseBody
    public int deleteTeam(int id){
        return ts.Delete_Team(id);
    }
}
