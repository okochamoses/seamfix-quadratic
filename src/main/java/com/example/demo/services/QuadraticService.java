package com.example.demo.services;

import com.example.demo.models.QuadraticValues;
import org.springframework.stereotype.Service;

@Service
public class QuadraticService {
    public QuadraticValues getQuadraticSolutionValues(double a, double b, double c) {

        return new QuadraticValues(
                equation(a, b, c, false),
                equation(a, b, c, true)
        );
    }

    private double solveForRoot(double a, double b, double c) {
        double val = (b * b) - (4 * a * c);
        if (val < 0) {
            throw new NumberFormatException("Values lead to an invalid result");
        }
        return Math.sqrt(val);
    }

    private double equation(double a, double b, double c, boolean isNegative) {
        // The sign variable was added in case someone decides to change the implementation in the future you won't need to track two equations wit + & -
        int sign = isNegative ? -1 : 1;
        double divisor = (b * -1) + (sign * solveForRoot(a, b, c));
        double dividend = 2 * a;

        return divisor / dividend;
    }
}
