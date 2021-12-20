package com.demo.controller;

import com.demo.pojo.Team;
import com.demo.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/race")
public class RaceController {
    @Autowired
    private TeamService ts;

    @RequestMapping("get_score/{id}")
    @ResponseBody
    public String GetTeam(@PathVariable int id){
        return ts.Get_Team(id).toString();
    }

    //排名信息
    @RequestMapping("/game_rank")
    @ResponseBody
    public List<Team> GetRank(){
        return ts.Get_Rank();
    }

    //随机打乱
    @RequestMapping("get_shuffle")
    @ResponseBody
    public List<Team> GetShuffle(){
        List<Team> t = ts.Get_Order();
        Collections.shuffle(t);
        return t;
    }

    //正常序列
    @RequestMapping("get_order")
    @ResponseBody
    public List<Team> GetOrder(){
        return ts.Get_Order();
    }

    //比赛的时候记录到打到哪一个 按照id来修改
    //此处的UserDetail未定
    //此处的post直接调用按照id查找来替换(get_rank)
    @GetMapping("/change_idx")
    public String detail(Model model, Integer id,Integer idx) {
        int role = ts.Count_Idx(id,idx);
        model.addAttribute("team", role);
        return "userDetail";
    }


}
