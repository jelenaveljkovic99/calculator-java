


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Testing {



    @Test
    public void testAddingPossitiveNumbers() {
        String expression = "2+3";
        float expectedResult = 5;
        float actualResult = Float.parseFloat(Calculator.Run(expression));
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAddingNegativeNumbers() {
        String expression = "-2+ -3";
        float expectedResult = -5;
        float actualResult = Float.parseFloat(Calculator.Run(expression));
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSubstractingPositiveNumbers() {
        String expression = "10-2";
        float expectedResult = 8;
        float actualResult = Float.parseFloat(Calculator.Run(expression));
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSubstractingNegativeNumbers() {
        String expression = "-9 - -3";
        float expectedResult = -6;
        float actualResult = Float.parseFloat(Calculator.Run(expression));
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultiplyingPossitiveNumbers() {
        String expression = "2*3";
        float expectedResult = 6;
        float actualResult = Float.parseFloat(Calculator.Run(expression));
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultiplyingNegativeNumbers() {
        String expression = "-8 * -3";
        float expectedResult = 24;
        float actualResult = Float.parseFloat(Calculator.Run(expression));
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDividingNegativeNumbers() {
        String expression = "-8 / -2";
        float expectedResult = 4;
        float actualResult = Float.parseFloat(Calculator.Run(expression));
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDividingPositiveNumbers() {
        String expression = "9/3";
        float expectedResult = 3;
        float actualResult = Float.parseFloat(Calculator.Run(expression));
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultyplingPositiveDecimalnumbers() {
        String expression = "2.5*3.2";
        float expectedResult = 8;
        float actualResult = Float.parseFloat(Calculator.Run(expression));
        assertEquals(expectedResult, actualResult);
    }
}

