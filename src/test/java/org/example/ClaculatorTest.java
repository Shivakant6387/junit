package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClaculatorTest {
    static Calculator calculator;

    @BeforeAll
    static void setUp(){
        System.out.println("Running before all tests");
        calculator = new Calculator();
    }
    @BeforeEach
    void beforeEach(){
        System.out.println("Running before each test");
    }
    @AfterEach
    void afterEach(){
        System.out.println("Running after each test");
    }
    @DisplayName("Addition")
    @Test
    void add() {
        System.out.println("Testing addition");
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    @DisplayName("Multiplication")
    void multiply() {
        System.out.println("Testing multiplication");
        assertEquals(25, calculator.multiply(5, 5));
    }

    @Test
    @DisplayName("Division")
    void divide() {
        System.out.println("Testing division");
        assertEquals(1, calculator.divide(5, 5));
    }

    @Test
    @DisplayName("Subtraction")
    void subtract() {
        System.out.println("Testing subtraction");
        assertEquals(0, calculator.subtract(5, 5));
    }
    @AfterAll
    static void tearDown(){
        System.out.println("Running after all tests");
        calculator = null;
    }
}