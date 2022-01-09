package ru.job4j.oop;

import org.junit.Test;

import static java.lang.Math.sqrt;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void testDistance5() {
        Point first = new Point(0, 0);
        Point second = new Point(5, 0);
        double result = first.distance(second);
        double expected = 5;
        assertThat(result, closeTo(expected, 0.001));
    }

    @Test
    public void testDistanceSqrt2() {
        Point first = new Point(0, 0);
        Point second = new Point(1, 1);
        double result = first.distance(second);
        double expected = sqrt(2);
        assertThat(result, closeTo(expected, 0.001));
    }

    @Test
    public void testDistance3d5() {
        Point first = new Point(0, 0, 0);
        Point second = new Point(5, 0, 0);
        double result = first.distance3d(second);
        double expected = 5;
        assertThat(result, closeTo(expected, 0.001));
    }

    @Test
    public void testDistance3dSqrt3() {
        Point first = new Point(0, 0, 0);
        Point second = new Point(1, 1, 1);
        double result = first.distance3d(second);
        double expected = sqrt(3);
        assertThat(result, closeTo(expected, 0.001));
    }
}