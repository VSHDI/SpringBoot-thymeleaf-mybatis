package com.vshdi.hello.spring.boot.mybatis.controller;

import com.vshdi.hello.spring.boot.mybatis.entity.City;
import com.vshdi.hello.spring.boot.mybatis.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CityController {

    @Autowired
    private CityMapper cityMapper;

    @GetMapping("city")
    private String city(Model model) {
        List<City> city = cityMapper.selectAll();
        model.addAttribute("city",city);
        return "city";
    }
}
