package com.example.lesson212;

import com.example.lesson212.service.CalculatorService;
import com.example.lesson212.service.CalculatorServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.yaml.snakeyaml.scanner.Constant;

import static com.example.lesson212.constants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceImplTest {

    CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    public void checkOnePlusTwoEqualsThree() {

        int actual = calculatorService.plus(ONE, TWO);
        int expected = ONE + TWO;

        assertEquals(expected, actual);
    }

    @Test
    public void checkZeroPlusFiveEqualsFive() {

        int actual = calculatorService.plus(ZERO, FIVE);
        int expected = ZERO + FIVE;

        assertEquals(expected, actual);
    }

    @Test
    public void checkFourMinusFiveEqualsMinusOne() {

        int actual = calculatorService.minus(FOUR, FIVE);
        int expected = FOUR - FIVE;

        assertEquals(expected, actual);
    }

    @Test
    public void checkThreeMinusTwoEqualsOne() {

        int actual = calculatorService.minus(THREE, TWO);
        int expected = THREE - TWO;

        assertEquals(expected, actual);
    }

    @Test
    public void checkTwoTimesTwoEqualsFour() {

        int actual = calculatorService.multiple(TWO, TWO);
        int expected = TWO * TWO;

        assertEquals(expected, actual);
    }

    @Test
    public void checkOneTimesZeroEqualsZero() {

        int actual = calculatorService.multiple(ONE, ZERO);
        int expected = ONE * ZERO;

        assertEquals(expected, actual);
    }

    @Test
    public void checkOnedivideByZeroEqualsError() {

        Assertions.assertThrows(DivideByZeroException.class,()->calculatorService.divide(ONE, ZERO));
    }

    @Test
    public void checkFourDivideByTwoEqualsTwo() {

        double actual = calculatorService.divide(FOUR, TWO);
        double expected = FOUR / TWO;

        assertEquals(expected, actual);
    }
}
