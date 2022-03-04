package com.mitrais;

import java.util.Optional;

interface MathOperation {
    double operate(int a, int b);
}

public class Lambda {
    public static void operation(int a, int b, MathOperation op){
        double result = op.operate(a, b);
        System.out.println("Result = " + result);
    }
}
