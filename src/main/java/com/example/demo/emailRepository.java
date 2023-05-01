package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class emailRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<Integer> getAllEuid(){
        List<Integer> ids = jdbcTemplate.queryForList("select euid from person;", Integer.class);
        return ids;
    }

    public List<String> getAllName(){
        List<String> name = jdbcTemplate.queryForList("select distinct first_name from person;", String.class);
        return name;
    }

    public Result e2a(){
        String query = """
                select e.nickname, count(u.address) as acCounts 
                from use u join euser e on u.euser = e.euid
                group by e.nickname, u.euser
                having count(u.address)>1
                order by acCounts, e.nickname;
                """;
        return new Result(query, jdbcTemplate.queryForList(query));
    }

    public Result e3a(int id){
        String query = "select username, domain from address where adid = ?";
        return new Result(query,jdbcTemplate.queryForList(query,id));
    }
}
