package ru.job4j.stream;

import java.util.Objects;

public class Student2 {

    private int score;
    private String surname;

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getScore() {
        return score;
    }

    public String getSurname() {
        return surname;
    }

    public Student2(String surname, int score) {
        this.score = score;
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student2 student2 = (Student2) o;
        return score == student2.score
                && surname.equals(student2.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, surname);
    }

}