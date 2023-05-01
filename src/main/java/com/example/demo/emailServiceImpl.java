package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class emailServiceImpl implements emailService {
    private final emailRepository emailRepository;

    @Autowired
    public emailServiceImpl(emailRepository eR){
        this.emailRepository = eR;
    }
    @Override
    public List<String> getAllNames() {
        return emailRepository.getAllName();
    }


    @Override
    public Result e2a() {
        return emailRepository.e2a();
    }

    @Override
    public String e3a(int id) {
        StringBuilder rep = new StringBuilder();
        List<Map<String,Object>> res = emailRepository.e3a(id).getResult();
        for (Map<String,Object> row:res){
            rep.append(row.get("username")).append("@").append(row.get("domain"));
        }
        return rep.toString();
    }
}
