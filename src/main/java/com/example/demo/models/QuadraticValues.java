package com.example.demo.models;

public class QuadraticValues {
    private double value1;
    private double value2;

    public QuadraticValues() {
    }

    public QuadraticValues(double value1, double value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "QuadraticValues{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }
}
