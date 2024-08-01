package com.sachin.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/math")
public class MathController {

	//http://localhost:8080/api/math/calculate?num1=10&num2=20&num3=30
	
    @GetMapping("/calculate")
    public CalculationResult calculate(
            @RequestParam("num1") double num1,
            @RequestParam("num2") double num2,
            @RequestParam("num3") double num3) {
        
        double sum = num1 + num2 + num3;
        double average = sum / 3;

        return new CalculationResult(sum, average);
    }
}
