package ru.job4j.inheritance;

public class ProfessionTest {
    public static void main(String[] args) {
        Surgeon surgen = new Surgeon("Болит нога", "нога");
        surgen.makeDiagnosis();
        surgen.cut();
    }
}
