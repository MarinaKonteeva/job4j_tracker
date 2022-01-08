package ru.job4j.oop;

public class Max {
    public static double max(double first, double second) {
    return first >= second ? first : second;
    }

    public static double max(double first, double second, double third) {
        return max(first, max(second, third));
    }

    public static double max(double first, double second, double third, double fourth) {
        return max(first, max(second, third, fourth));
    }
}

