package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        String[] o11 = o1.split("/");
        String[] o22 = o2.split("/");
        int len = Math.min(o11.length, o22.length);
        int rsl = o22[0].compareTo(o11[0]);
        if (rsl == 0 && len > 1) {
            rsl = o11[1].compareTo(o22[1]);
            if (rsl == 0 && len > 2) {
                rsl = o11[2].compareTo(o22[2]);
                if (rsl == 0 && len > 2) {
                    rsl = 0;
                } else if (rsl == 0 && len == 2) {
                    rsl = Integer.compare(o11.length, o22.length);
                }
            } else if (rsl == 0 && len == 2) {
                rsl = Integer.compare(o11.length, o22.length);
            }
        } else if (rsl == 0 && len == 1) {
            rsl = Integer.compare(o11.length, o22.length);
        }
        return rsl;
    }
}