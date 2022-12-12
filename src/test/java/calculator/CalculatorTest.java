package calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @ParameterizedTest
    @CsvSource({"4,5","2,3","1,1"})
    void testMultiplyGoodCase(int x, int y){
        assertEquals(x*y,Calculator.multiply(x,y));
    }

    @ParameterizedTest
    @CsvSource({"5,1","100,2","33,9"})
    void testDivideGoodCase(int x, int y){
        assertEquals(x/y,Calculator.divide(x,y));
    }
    @Test
    void testDivideDivideBy0() throws ArithmeticException{
        int x = 0;
        int y = 0;
        assertThrows(ArithmeticException.class ,() -> Calculator.divide(1,0));
    }

    @ParameterizedTest
    @CsvSource({"5,1","100,2","33,9"})
    void testSumGoodCase(int x, int y){
        assertEquals(x+y,Calculator.divide(x,y));
    }

    @ParameterizedTest
    @CsvSource({"5,1","100,2","33,9"})
    void testSubtractGoodCase(int x, int y){
        assertEquals(x-y,Calculator.divide(x,y));
    }




}