package com.demo.controller;

import com.demo.pojo.Team;
import com.demo.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public ResponseEntity<String> addTeam(Team t){
        int n =  ts.Add_Team(t);
        if(n > 0)return new ResponseEntity<>("Ok", HttpStatus.OK);
        return new ResponseEntity<>("False", HttpStatus.SERVICE_UNAVAILABLE);
    }

    @PostMapping("/count")
    @ResponseBody
    public ResponseEntity<String> countScore(Team t){
        int n =   ts.Count_Score(t);
        if(n > 0)return new ResponseEntity<>("Ok", HttpStatus.OK);
        return new ResponseEntity<>("False", HttpStatus.SERVICE_UNAVAILABLE);
    }

    @GetMapping("/delete")
    @ResponseBody
    public ResponseEntity<String> deleteTeam(int id){
        int n = ts.Delete_Team(id);
        if(n > 0)return new ResponseEntity<>("Ok", HttpStatus.OK);
        return new ResponseEntity<>("False", HttpStatus.SERVICE_UNAVAILABLE);
    }

    /*编辑角色详情*/
    @GetMapping("/edit")
    public String detail(Model model, Integer id) {
        Team role = ts.Get_Team(id);
        model.addAttribute("team", role);
        return "userDetail";
    }
}
