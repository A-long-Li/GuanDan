package com.demo.controller;

import com.demo.mapper.TeamMapper;
import com.demo.pojo.Team;
import com.demo.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/tb")
public class rank {

    @Autowired
    private TeamService ts;

    @RequestMapping("getTeam/{id}")
    @ResponseBody
    public String GetTeam(@PathVariable int id){
        return ts.getTeam(id).toString();
    }
    @RequestMapping("GR")
    @ResponseBody
    public String getRank(){
        return ts.GetRank().toString();
    }
}
