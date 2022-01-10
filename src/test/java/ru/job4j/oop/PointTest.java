package ru.job4j.oop;

import org.junit.Test;

import static java.lang.Math.sqrt;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void when00and50then5() {
        Point first = new Point(0, 0);
        Point second = new Point(5, 0);
        double result = first.distance(second);
        double expected = 5;
        assertThat(result, closeTo(expected, 0.001));
    }

    @Test
    public void when00and11then1dot414() {
        Point first = new Point(0, 0);
        Point second = new Point(1, 1);
        double result = first.distance(second);
        double expected = 1.414;
        assertThat(result, closeTo(expected, 0.001));
    }

    @Test
    public void when000and500then5() {
        Point first = new Point(0, 0, 0);
        Point second = new Point(5, 0, 0);
        double result = first.distance3d(second);
        double expected = 5;
        assertThat(result, closeTo(expected, 0.001));
    }

    @Test
    public void when000and111then1dot732() {
        Point first = new Point(0, 0, 0);
        Point second = new Point(1, 1, 1);
        double result = first.distance3d(second);
        double expected = 1.732;
        assertThat(result, closeTo(expected, 0.001));
    }
}