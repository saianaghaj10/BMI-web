package com.example.bmicalculator;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BmiController {

    @GetMapping("/bmi")
    public double computeBmi(@RequestParam double height, @RequestParam double weight) {
        double heightInMeters = height / 100;
        return weight / (heightInMeters * heightInMeters);
    }
}
