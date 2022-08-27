package com.demo.controller;

import com.demo.service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class DemoController {
    private final DemoService demoService;

    @PostMapping()
    public Map<String, Long> getOperations(@RequestBody HashMap<String, Long> numbers) {
        return demoService.getOperations(numbers.get("num1"), numbers.get("num2"));
    }
}
