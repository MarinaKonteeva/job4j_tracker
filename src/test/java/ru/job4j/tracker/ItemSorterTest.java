package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ItemSorterTest {

    @Test
    public void itemAscByName() {
        Item item1 = new Item("testB", 1);
        Item item2 = new Item("testD", 2);
        Item item3 = new Item("testA", 3);
        List<Item> items = Arrays.asList(item1, item2, item3);
        Collections.sort(items, new ItemAscByName());
        List<Item> expected = Arrays.asList(item3, item1, item2);
        Assert.assertArrayEquals(items.toArray(), expected.toArray());
    }

    @Test
    public void itemDescByName() {
        Item item1 = new Item("testB", 1);
        Item item2 = new Item("testD", 2);
        Item item3 = new Item("testA", 3);
        List<Item> items = Arrays.asList(item1, item2, item3);
        Collections.sort(items, new ItemDescByName());
        List<Item> expected = Arrays.asList(item2, item1, item3);
        Assert.assertArrayEquals(items.toArray(), expected.toArray());
    }
}