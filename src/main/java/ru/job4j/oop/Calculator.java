package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation(int d) {
        Calculator calculator = new Calculator();
        return Calculator.sum(d) + calculator.multiply(d)
                + calculator.minus(d) + calculator.divide(d);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        rsl = Calculator.minus(10);
        System.out.println(rsl);
        rsl = calculator.divide(10);
        System.out.println(rsl);
        rsl = calculator.sumAllOperation(100);
        System.out.println(rsl);
    }
}
