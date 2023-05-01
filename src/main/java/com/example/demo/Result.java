package com.example.demo;

import java.util.List;
import java.util.Map;

public class Result {
    private String query;
    private List<Map<String,Object>> result;

    public Result(String param1, List<Map<String,Object>> param2) {
        this.setQuery(param1);
        this.setResult(param2);
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public List<Map<String, Object>> getResult() {
        return result;
    }

    public void setResult(List<Map<String, Object>> result) {
        this.result = result;
    }

    @Override
    public String toString(){
        return this.getQuery() + "\n" + this.getResult();
    }
}
