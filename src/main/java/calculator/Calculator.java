package calculator;


public class Calculator {

    public static int multiply(int x, int y){
        return x*y;
    }

    public static int divide(int x, int y) throws ArithmeticException{
        return x/y;
    }
    public static int sum(int x, int y){
        return x+y;
    }
    public static int subtract(int x, int y){
        return x-y;
    }
}
