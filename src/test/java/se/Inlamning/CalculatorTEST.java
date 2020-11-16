package se.Inlamning;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTEST {

    @Test
    @DisplayName(" Testing add-method i calculator class")
    void testAdd() {
        Calculator calculator = new Calculator();
        assertNotEquals(10, calculator.add(5, 6));
    }

    @Test
    @DisplayName(" Testing Substract-method i calculator class")
    void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(15, calculator.subtract(20, 5));
    }
    @Test
    @DisplayName(" Testing Multiply-method i calculator class")
    void testmultiply() {
        Calculator calculator = new Calculator();
        assertEquals(20, calculator.multiply(10, 2));
    }
    @DisplayName(" Testing Divide-method i calculator class")
    @RepeatedTest(4)
    void testdivide() {
        Calculator calculator = new Calculator();
        assertEquals(30, calculator.divide(60, 2));
    }
    @BeforeAll
    public static void init(){
        System.out.println("Testing all the calculator options");
    }
}

