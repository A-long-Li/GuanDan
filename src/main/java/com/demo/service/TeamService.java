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

    public List<Team> Get_Rank(){
        return tm.GetRank();
    }

    public Team Get_Team(int id){
        return tm.GetTeam(id);
    }

    public int Update_Team(Team t){
        return tm.Update(t);
    }

    public int Add_Team(Team t){
        return tm.AddTeam(t);
    }

    public int Count_Score(Team t){return tm.CountScore(t);}

    public int Delete_Team(int id){
        return tm.DeleteTeam(id);
    }


    public List<Team> Get_Order(){return tm.GetOrder();}

}
