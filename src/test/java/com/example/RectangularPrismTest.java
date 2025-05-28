package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RectangularPrismTest {

    @Test
    public void testRectangularPrismCalculation() {
        int result = RectangularPrism.calculate(2, 3, 4);
        assertEquals(24, result);
    }

    @Test
    public void testValueWithZeroHeight() {
        int result = RectangularPrism.calculate(0, 3, 5);
        assertEquals(0, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeValueException() {
        RectangularPrism.calculate(-1, 2, 3);
    }

    @Test
    public void testAllZeros() {
        int result = RectangularPrism.calculate(0, 0, 0);
        assertEquals(0, result);
    }

    @Test
    public void testLargeValue() {
        int result = RectangularPrism.calculate(1000, 2000, 3000);
        assertEquals(1705032704, result);
    }
}