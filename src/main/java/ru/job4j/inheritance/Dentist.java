package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private String teeth;

    public Dentist(String name, String surname, String education, String birthday, String diagnosis, String teeth) {
        super(name, surname, education, birthday, diagnosis);
        this.teeth = teeth;
    }

    public void treatTeeth() {
        System.out.println("В диагнозе сказано, что нужно вылечить " + teeth);
    }
}
