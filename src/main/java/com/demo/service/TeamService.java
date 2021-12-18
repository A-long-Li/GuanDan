package com.demo.service;

import com.demo.mapper.TeamMapper;
import com.demo.pojo.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    @Autowired
    TeamMapper tm;

    public List<Team> GetRank(){
        return tm.GetRank();
    }
    public Team getTeam(int id){
        return tm.GetTeam(id);
    }
    public int UpdateTeam(Team t){
        return tm.Update(t);
    }
    public int addTeam(Team t){
        return tm.addTeam(t);
    }
}
