package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCalculatorTest {
    private MyCalculator myCalculator=new MyCalculator();
    @Test
    void add() {

        int expectedResult=10;
        int actualResult=myCalculator.add(5,5);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void sub() {
        int expectedResult=2;
        int actualResult=myCalculator.sub(7,5);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void mult() {
        int expectedResult=25;
        int actualResult=myCalculator.mult(5,5);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void div() {
        int expectedResult=5;
        int actualResult=myCalculator.div(25,5);
        assertEquals(expectedResult,actualResult);
    }
}