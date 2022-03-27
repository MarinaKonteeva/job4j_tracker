package ru.job4j.function;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class DiapasonTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = Diapason.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLinearFunctionThenQuardResults() {
        List<Double> result = Diapason.diapason(5, 8, x -> x * x + 2);
        List<Double> expected = Arrays.asList(27D, 38D, 51D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLinearFunctionThenExpResults() {
        List<Double> result = Diapason.diapason(5, 8, x -> Math.pow(2, x) + 1);
        List<Double> expected = Arrays.asList(33D, 65D, 129D);
        assertThat(result, is(expected));
    }
}