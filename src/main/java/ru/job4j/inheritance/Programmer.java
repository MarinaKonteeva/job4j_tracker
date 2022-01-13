package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String program;

    public Programmer(String name, String surname, String education, String birthday, String typeProject, String program) {
        super(name, surname, education, birthday, typeProject);
        this.program = program;
    }

    public void develop(String program) {
        System.out.println("Я разрабатываю " + program + "по проекту");
    }
}
