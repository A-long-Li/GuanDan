package com.demo.mapper;

import com.demo.pojo.Team;
import org.apache.ibatis.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import java.util.List;

@Mapper
public interface TeamMapper {
//    //获取排名
//    @Select("select * from gd.team order by score desc")
//    List<Team> getRank();
//
//    //新建队伍
//    @Insert("insert into gd.team (id,player1,player2,score,idx) values(#{id},#{player1},#{player2},#{score},#{idx})")
//    int addTeam(Team t);
//
//    //修改成员名称
//    @Update("update gd.team set player1=#{player1},player2=#{player2} where id = #{id}")
//    int update(Team t);
    //按照id查询
    Team GetTeam(int id);
    //查询rank
    List<Team> GetRank();
    //修改
    int Update(Team t);

    //增加用户
    int addTeam(Team t);

}
