package com.example.demo.controller;

import com.example.demo.models.QuadraticValues;
import com.example.demo.models.ServiceResponse;
import com.example.demo.services.QuadraticService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("quadratic")
public class QuadraticController {

    private final QuadraticService quadraticService;

    public QuadraticController(QuadraticService quadraticService) {
        this.quadraticService = quadraticService;
    }

    @GetMapping("/solve")
    public Object quadraticSolution(
            @RequestParam("a") double a,
            @RequestParam("b") double b,
            @RequestParam("c") double c
    ) {
        ServiceResponse<QuadraticValues> serviceResponse;
        try {
            QuadraticValues ans = quadraticService.getQuadraticSolutionValues(a, b, c);
            serviceResponse = new ServiceResponse<>(true, "Success", ans);
        } catch (NumberFormatException e) {
            serviceResponse = new ServiceResponse<>(false, e.getMessage());
        } catch (Exception e) {
            serviceResponse = new ServiceResponse<>(false, "Something went wrong!");
        }

        return serviceResponse;
    }
}
