package com.example.demo;

import java.util.List;
import java.util.Map;

public interface emailService {
    List<String> getAllNames();
    List<Integer> getAllEuid();
    Result e2a();
    String e3a(int id);
}
