package com.example.lesson212.service;

import com.example.lesson212.DivideByZeroException;
import org.springframework.stereotype.Service;

@Service

public class CalculatorServiceImpl implements CalculatorService {


    @Override
    public int plus(Integer a, Integer b) {

        return a + b;
    }

    @Override
    public int minus(Integer a, Integer b) {
        return a - b;
    }

    @Override
    public int multiple(Integer a, Integer b) {
        return a * b;
    }

    @Override
    public double divide(Integer a, Integer b) {
        if (b == 0) {
            throw new DivideByZeroException("На ноль делить нельзя!");
        }
        return (double) a / b;
    }
}
