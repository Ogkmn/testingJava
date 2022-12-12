package calculator;


public class Calculator {

    public static double multiply(double x, double y){
        return x*y;
    }

    public static double divide(double x, double y) throws ArithmeticException{
        if(y==0.0) throw new ArithmeticException();
        return x/y;
    }
    public static double sum(double x, double y){
        return x+y;
    }
    public static double subtract(double x, double y){
        return x-y;
    }
}
