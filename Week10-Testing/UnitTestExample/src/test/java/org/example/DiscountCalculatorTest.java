package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountCalculatorTest {
    //There are 3 parts to a unit test
    //Arrange, Act, Assert

    @Test
    void quantityBetweenOneAndFour_NoDiscount(){
        //Arrange
        DiscountCalculator calculator = new DiscountCalculator();

        //Act
        double result = calculator.calculateDiscount(10, 2);

        //Assert
        assertEquals(10, result);
    }

    @Test
    void quantityBelowOne_ThrowsException(){
        DiscountCalculator calculator = new DiscountCalculator();

        assertThrows(IllegalArgumentException.class, () -> {
           calculator.calculateDiscount(50, 0);
        });
    }
}