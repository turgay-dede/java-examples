package com.turgaydede.lambdaExpression;

public class Main {
    public static void main(String[] args) {
        Math adder = ((arg1, arg2) -> arg1+arg2);
        doMath(adder,2,3);

        Math power = java.lang.Math::pow;
        doMath(power,2,3);

        doMath(((arg1, arg2) -> arg1-arg2),6,4);

        doMath(((arg1, arg2) -> arg1-arg2),8,2);

    }

    public static void doMath(Math math, double arg1, double arg2) {
        double result = math.calculate(arg1, arg2);
        System.out.println(result);
    }
}
