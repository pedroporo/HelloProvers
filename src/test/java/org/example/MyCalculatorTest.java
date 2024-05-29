package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCalculatorTest {
    MyCalculator myCalculator;
    @BeforeEach
    void setUpMyCalculator(){
        myCalculator=new MyCalculator();
        System.out.println("MyCalculator created");
    }
    @AfterEach
    void tearDownMyCalculator(){
        myCalculator=null;
        System.out.println("MyCalculator=null”. (tearDownMyCalculator())");
    }

    @Test
    void add() {

        int expectedResult=10;

        int num1=5;
        int num2=5;

        int actualResult=myCalculator.add(num1,num2);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void sub() {
        int expectedResult=2;
        int num1=7;
        int num2=5;
        int actualResult=myCalculator.sub(num1,num2);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void mult() {
        int expectedResult=25;
        int num1=5;
        int num2=5;
        int actualResult=myCalculator.mult(num1,num2);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void div() {
        int expectedResult=5;
        int num1=25;
        int num2=5;
        int actualResult=myCalculator.div(num1,num2);
        assertEquals(expectedResult,actualResult);
    }
    @Test
    void divByZero() {
        int expectedResult=5;
        int num1=5;
        int num2=0;
        int actualResult=myCalculator.div(num1,num2);
        assertEquals(expectedResult,actualResult);
    }
    @Test
    void addWhenNegativeThrowsException(){

        int expectedResult=10;

        int num1=-5;
        int num2=2;


        assertThrows(IllegalArgumentException.class, () ->myCalculator.add(num1,num2));
    }
    @Test
    void subWhenNegativeThrowsException(){
        int expectedResult=10;

        int num1=-7;
        int num2=5;

        assertThrows(IllegalArgumentException.class, () ->myCalculator.sub(num1,num2));
    }

    @Test
    void multWhenNegativeThrowsException(){
        int num1=5;
        int num2=-5;
        assertThrows(IllegalArgumentException.class, () ->myCalculator.mult(num1,num2));
    }
    @Test
    void divWhenNegativeThrowsException(){
        int num1=-25;
        int num2=3;
        assertThrows(IllegalArgumentException.class, () ->myCalculator.div(num1,num2));
    }
}