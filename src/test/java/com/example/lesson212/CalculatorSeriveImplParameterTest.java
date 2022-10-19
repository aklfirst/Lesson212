package com.example.lesson212;

import com.example.lesson212.service.CalculatorService;
import com.example.lesson212.service.CalculatorServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.example.lesson212.constants.*;
import static com.example.lesson212.constants.ONE;

public class CalculatorSeriveImplParameterTest {

    CalculatorService calculatorService = new CalculatorServiceImpl();

public static Stream<Arguments> provideParamsForTests() {
return Stream.of(
        Arguments.of(ONE, TWO),
        Arguments.of(TWO, THREE),
        Arguments.of(FOUR, FIVE)
        );
}
@ParameterizedTest
@MethodSource("provideParamsForTests")

    public void checkCorrectSum(int a, int b) {
    int actual = calculatorService.plus(a,b);
    Assertions.assertEquals(a+b,actual);
}

    @ParameterizedTest
    @MethodSource("provideParamsForTests")

    public void checkCorrectMinus(int a, int b) {
        int actual = calculatorService.minus(a,b);
        Assertions.assertEquals(a-b,actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")

    public void checkCorrectMultiple(int a, int b) {
        int actual = calculatorService.multiple(a,b);
        Assertions.assertEquals(a*b,actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")

    public void checkCorrectDivision(double a, double b) {
        double actual = calculatorService.divide((int) a, (int) b);
        double expected = a / b;
        Assertions.assertEquals(expected,actual);
    }

}
