package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {

    SumCalculator sumCalculator;

    @BeforeEach
    void setUp() {
        sumCalculator = new SumCalculator();
//        System.out.println("run");
    }

    @Test
    void sumOneElement() {
        int actual = sumCalculator.sum(1);
        Assertions.assertEquals(1, actual);
    }

    @Test
    void sumThreeElements() {
        int actual = sumCalculator.sum(3);
        Assertions.assertEquals(6, actual);
    }

    @Test
    void sumZeroElements() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> sumCalculator.sum(0)
        );
    }

}