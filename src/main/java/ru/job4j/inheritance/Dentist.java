package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private String teeth;

    public Dentist(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Dentist(String diagnosis, String teeth) {
        super(diagnosis);
        this.teeth = teeth;
    }

    public void treatTeeth() {
        System.out.println("В диагнозе сказано, что нужно вылечить " + teeth);
    }
}
