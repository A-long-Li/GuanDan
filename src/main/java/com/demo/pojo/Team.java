package com.demo.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;


@Alias("team")
@Data
public class Team {
    //团队id
    private int id;
    //选手1，2的名字
    private  String player1;
    private  String player2;
    //团队分数
    private int score;
    //打到哪一个
    private String idx;
}
