package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class Tracker {
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    public List<Item> findAll() {
        return items;
    }

    public List<Item> findByName(String key) {
        List<Item> rsl = new ArrayList<>();

        for (Item item: items) {
            if (item.getName().equals(key)) {
                rsl.add(item);
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    private int indexOf(int id) {
        int rsl = -1;
        int index = 0;
        for (Item item: items) {
            if (item.getId() == id) {
                rsl = index;
                break;
            }
            index++;
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        item.setId(id);
        Item item2 = items.set(index, item);
        return item2 != null;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        Item item = items.remove(index);
        return item != null;
    }
}