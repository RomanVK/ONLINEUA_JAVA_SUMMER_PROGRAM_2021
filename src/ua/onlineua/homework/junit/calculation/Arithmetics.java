package ua.onlineua.homework.junit.calculation;

public class Arithmetics {

    public double add (double a, double b){
        return a + b;
    }

    public double deduct(double a, double b){
        return a - b;
    }

    public double mult(double a, double b){
        return a * b;
    }

    public double div(double a, double b) throws ArithmeticException{
        double result = a/b;
        if(Math.abs(result) == Double.POSITIVE_INFINITY)
            throw new ArithmeticException();
        return result;
    }
}
