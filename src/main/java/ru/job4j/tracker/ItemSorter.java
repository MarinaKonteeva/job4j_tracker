package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemSorter {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("testB", 1),
                new Item("testD", 2),
                new Item("testA", 3)
        );
        System.out.println(items);

        Collections.sort(items, new ItemAscByName());
        System.out.println(items);

        Collections.sort(items, new ItemDescByName());
        System.out.println(items);
    }
}
