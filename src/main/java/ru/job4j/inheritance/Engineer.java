package ru.job4j.inheritance;

public class Engineer extends Profession {

    private String typeProject;

    public Engineer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Engineer(String typeProject) {
        super();
        this.typeProject = typeProject;
    }

    public void makeProject() {
        System.out.println("Я сделал проект " + typeProject);
    }
}
