package ru.job4j.ex;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenStartGreaterThenFinish() {
        Fact fact = new Fact();
        fact.calc(-1);
    }

    @Test
    public void when3then6() {
        Fact fact = new Fact();
        int rsl = fact.calc(3);
        assertThat(rsl, is(6));
    }
}

