package com.sachin.controller;

public class CalculationResult {

    private double sum;
    private double average;

    public CalculationResult(double sum, double average) {
        this.sum = sum;
        this.average = average;
    }

    // Getters and Setters
    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
}
