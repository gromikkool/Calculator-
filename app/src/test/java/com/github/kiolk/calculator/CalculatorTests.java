package com.github.kiolk.calculator;

import com.github.kiolk.calculator.utils.Calculation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTests {

    @Test
    public void addition_isCorrect() {
        assertEquals(4, Calculation.sum(2, 2));
    }

    @Test
    public void minus_isCorrect() {
        assertEquals(3, Calculation.minus(5, 2));
    }

    @Test
    public void multiplication_isCorrect() {
        assertEquals(20, Calculation.multipl(2, 10));
    }

    @Test
    public void divided_isCorrect() {
        assertEquals(8, Calculation.divide(72, 9));
    }

    @Test
    public void basic_isCorrect() {
        assertEquals("4", Calculation.calculate("2+2"));
        assertEquals("6", Calculation.calculate("7-1"));
        assertEquals("81", Calculation.calculate("81*1"));
        assertEquals("250", Calculation.calculate("1000/4"));
    }

    @Test
    public void normal_isCorrect() {
        assertEquals("2", Calculation.calculate("2+2-2"));
        assertEquals("18", Calculation.calculate("7-1*3"));
        assertEquals("80", Calculation.calculate("81*1-1"));
        assertEquals("253", Calculation.calculate("1000/4+3"));
    }

    @Test
    public void advance_isCorrect() {
        assertEquals("6", Calculation.calculate("2+2*2"));
        assertEquals("2", Calculation.calculate("4+2*3-2*4"));
        assertEquals("8", Calculation.calculate("2+3*4/2"));
        assertEquals("48", Calculation.calculate("8/2*3*4"));
    }
}
