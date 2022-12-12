package calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @ParameterizedTest
    @CsvSource({"4,5","2,3","1,1"})
    void testMultiplyGoodCase(double x, double y){
        assertEquals(x*y,Calculator.multiply(x,y));
    }

    @ParameterizedTest
    @CsvSource({"5.0,1.0","100.0,2.0","33.0,9.0"})
    void testDivideGoodCase(double x, double y){
        assertEquals(x/y,Calculator.divide(x,y));
    }
    @Test
    void testDivideDivideBy0() throws ArithmeticException{
        double x = 2;
        double y = 0;
        assertThrows(ArithmeticException.class ,() -> Calculator.divide(x,y));
    }

    @ParameterizedTest
    @CsvSource({"5.0,1","100,2","33,9"})
    void testSumGoodCase(double x, double y){
        assertEquals(x+y,Calculator.sum(x,y));
    }

    @ParameterizedTest
    @CsvSource({"5,1","100,2","33,9"})
    void testSubtractGoodCase(double x, double y){
        assertEquals(x-y,Calculator.subtract(x,y));
    }




}