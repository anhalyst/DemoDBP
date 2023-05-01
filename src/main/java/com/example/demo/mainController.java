package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@Controller
//@RequestMapping(path="/dbQueries")
public class mainController {

    private final emailServiceImpl emailServiceImpl;

    @Autowired
    public mainController(emailServiceImpl eRI){
        this.emailServiceImpl = eRI;
    }

    @GetMapping("/dbQueries")
    public String chooseExercise(){
        return "chooseExercise";
    }

    @GetMapping("/dbQueries/e3")
    // TODO: Complete mapping and implementing exercise 3
    public String e3(@RequestParam("id") int id, Model model){
        model.addAttribute("id",emailServiceImpl.e3a(id));
        return "e3";
    }

    @GetMapping("/dbQueries/uid")
    public String printEuid(Model model){
        model.addAttribute("id",emailServiceImpl.getAllNames());
        return "uid_test";
    }


    @GetMapping("/dbQueries/e2")
    public String e2(@RequestParam("task") String task, Model model){
        Result res;
        List<Map<String,Object>> rows = null;
        String query = "not yet init";

        switch(task){
            case "a":
                res = emailServiceImpl.e2a();
                rows = res.getResult();
                query = res.getQuery();
                break;
            case "b":
                //TODO: Implement Exercise part 2 b->i
                break;
            case "c":
                break;
        }
        assert rows != null;
        List<String> columns = rows.stream()
                .flatMap(map -> map.keySet().stream())
                .distinct()
                .collect(Collectors.toList());
        
        model.addAttribute("query", query);
        model.addAttribute("rows", rows);
        model.addAttribute("columns", columns);

        return "e2";
    }

    // TODO: Mapping and implementing exercise 4

}
