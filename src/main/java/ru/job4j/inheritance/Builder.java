package ru.job4j.inheritance;

public class Builder extends Engineer {

    private String material;

    public Builder(String name, String surname, String education, String birthday, String typeProject, String material) {
        super(name, surname, education, birthday, typeProject);
        this.material = material;
    }

    public void buildHouse() {
        makeProject();
        System.out.println("По проекту я строю дом из " + material);
    }
}
