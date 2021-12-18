package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SuppressWarnings("all")
@Controller
public class RenderController {

    @GetMapping(value = {"/idx"})
    public String getidx(){
        return "luru";
    }

    @GetMapping(value = {"/race"})
    public String start_race(){
        return "bisai";
    }


}
