package com.demo.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DemoService {
    public Map<String, Long> getOperations(Long num1, Long num2) {
        if(num2 == 0){
            throw new RuntimeException("num2 must not be zero");
        }
        Map<String, Long> result = new HashMap<>();
        result.put("Addition" ,num1+num2);
        result.put("Subtraction" ,num1-num2);
        result.put("Multiplication" ,num1*num2);
        result.put("Division" ,num1/num2);
        return result;
    }
}
