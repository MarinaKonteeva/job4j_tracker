package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map  = new HashMap<>();
        map.put("chujkova@mail.ru", "Konteeva Marina Aleksandrovna");
        map.put("akonteev@gmail.com", "Konteev Aleksey Aleksandrovich");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
