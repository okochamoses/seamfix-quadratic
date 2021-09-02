package com.example.demo.services;

import com.example.demo.models.QuadraticValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticServiceTest {
    private QuadraticService quadraticService = new QuadraticService();


    @Test
    void getQuadraticSolutionValues() {
        QuadraticValues quadraticValues = quadraticService.getQuadraticSolutionValues(2,5,3);

        assertEquals(-1, quadraticValues.getValue1());
        assertEquals(-1.5, quadraticValues.getValue2());
    }
    @Test
    void getQuadraticSolutionValues_throws_exception_for_invalid_inputs() {
        assertThrows(NumberFormatException.class, () -> quadraticService.getQuadraticSolutionValues(5,2,3));
    }

}