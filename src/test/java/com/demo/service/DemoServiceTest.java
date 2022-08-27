package com.demo.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DemoServiceTest {
    private static final Long num1 = 100_000_000_000L;
    private static final Long num2 = -100_000_000_000L;
    private static final Long num2_equal_zero = 0L;

    @Autowired
    private DemoService demoService;

    @Test
    public void getOperations_successScenario() {
        Map<String, Long> result = demoService.getOperations(num1, num2);
        assertEquals(4, result.size());
        assertEquals(num1+num2, result.get("Addition"));
        assertEquals(num1-num2, result.get("Subtraction"));
    }

    @Test
    public void getOperations_failedScenario() {
        assertThrows(RuntimeException.class, () -> demoService.getOperations(num1, num2_equal_zero), "num2 must not be zero");
    }

}