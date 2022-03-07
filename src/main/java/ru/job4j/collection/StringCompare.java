package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int len = left.length() < right.length() ? left.length() : right.length();
        for (int i = 0; i < len; i++) {
            if (Character.compare(left.charAt(i), right.charAt(i)) != 0) {
                return Character.compare(left.charAt(i), right.charAt(i));
            }
        }
        return Integer.compare(left.length(), right.length());
    }
}