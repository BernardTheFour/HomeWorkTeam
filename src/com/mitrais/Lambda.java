package com.mitrais;

interface MathOperation {
    double power(int a, int b);
}

public class Lambda {
    public static void main(String[] args){
        powerOf(5, 3, (a, b) -> Math.pow(a, b));
    }

    public static void powerOf(int a, int b, MathOperation op){
        double result = op.power(a, b);
        System.out.println(a + "^" + b + " = " + result);
    }
}
