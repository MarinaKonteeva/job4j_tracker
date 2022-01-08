package ru.job4j.oop;

import junit.framework.TestCase;
import org.junit.Assert;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class MaxTest extends TestCase {

    public void testMax2() {
        double first = 1;
        double second = 2;
        double result = Max.max(first, second);
        double expected = 2;
        assertThat(result, closeTo(expected, 0.001));
    }

    public void testMax3() {
        double first = 1;
        double second = 2;
        double third = 3;
        double result = Max.max(first, second, third);
        double expected = 3;
        assertThat(result, closeTo(expected, 0.001));
    }

    public void testMax4() {
        double first = 1;
        double second = 2;
        double third = 3;
        double fourth = 4;
        double result = Max.max(first, second, third, fourth);
        double expected = 4;
        assertThat(result, closeTo(expected, 0.001));
    }
}