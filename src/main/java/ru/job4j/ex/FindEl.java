package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        if (key == null) {
            throw new ElementNotFoundException("key could not be null");
        }

        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            String key = null;
            String[] str = new String[]{"one", "two", "three", "four"};
            int k = indexOf(str, key);
            } catch (ElementNotFoundException e) {
            System.out.println("искючение перехватили и рассказали об этом!!!");
            e.printStackTrace();
        }
    }
}
