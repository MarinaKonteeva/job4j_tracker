package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private String body;

    public Surgeon(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Surgeon(String diagnosis, String body) {
        super(diagnosis);
        this.body = body;
    }

    public void cut() {
        System.out.println("В диагнозе сказано, что нужно отрезать " + body);
    }
}
