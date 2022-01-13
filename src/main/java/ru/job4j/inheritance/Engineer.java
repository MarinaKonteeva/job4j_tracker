package ru.job4j.inheritance;

public class Engineer extends Profession {

    private String typeProject;

    public Engineer(String name, String surname, String education, String birthday, String typeProject) {
        super(name, surname, education, birthday);
        this.typeProject = typeProject;
    }

    public void makeProject() {
        System.out.println("Я сделал проект " + typeProject);
    }
}
