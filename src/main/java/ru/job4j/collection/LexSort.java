package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {

        String[] subs1 = left.split(" ");
        String[] subs2 = right.split(" ");
        String[] ch1 = subs1[0].split("\\.");
        String[] ch2 = subs2[0].split("\\.");
        int len = ch1.length < ch2.length ? ch1.length : ch2.length;

        for (int i = 0; i < len; i++) {
            int l = Integer.parseInt(ch1[i]);
            int r = Integer.parseInt(ch2[i]);
            int rsl = Integer.compare(l, r);
            if (rsl != 0) {
                return rsl;
            }
        }

        return Integer.compare(ch1.length, ch2.length);
    }
}