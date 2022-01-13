package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private String body;

    public Surgeon(String name, String surname, String education, String birthday, String diagnosis, String body) {
        super(name, surname, education, birthday, diagnosis);
        this.body = body;
    }

    public void cut() {
        System.out.println("В диагнозе сказано, что нужно отрезать " + body);
    }
}
