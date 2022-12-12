package calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @ParameterizedTest
    @CsvSource({"4,5,20","2,3,6","1,1,1"})
    void testMultiplyGoodCase(double x, double y,double expected){
        assertEquals(Calculator.multiply(x,y),expected);
    }

    @ParameterizedTest
    @CsvSource({"5.0,1.0,5","100.0,2.0,50.0","27.0,9.0,3"})
    void testDivideGoodCase(double x, double y,double expected){
        assertEquals(Calculator.divide(x,y),expected);
    }
    @Test
    void testDivideDivideBy0() throws ArithmeticException{
        double x = 2;
        double y = 0;
        assertThrows(ArithmeticException.class ,() -> Calculator.divide(x,y));
    }

    @ParameterizedTest
    @CsvSource({"5.0,1,6","100,2,102","33,9,42"})
    void testSumGoodCase(double x, double y,double expected){
        assertEquals(Calculator.sum(x,y),expected);
    }

    @ParameterizedTest
    @CsvSource({"5,1,4","100,2,98","33,9,24"})
    void testSubtractGoodCase(double x, double y,double expected){
        assertEquals(Calculator.subtract(x,y),expected);
    }
}