package ru.job4j.inheritance;

public class ProfessionTest {
    public static void main(String[] args) {
        Surgeon surgeon = new Surgeon("Иван", "Иванов", "высшее", "в январе", "Болит нога", "нога");
        surgeon.makeDiagnosis();
        surgeon.cut();
    }
}
