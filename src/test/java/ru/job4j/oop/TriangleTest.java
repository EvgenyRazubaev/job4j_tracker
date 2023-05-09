package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class TriangleTest {

    @Test
    public void when00and40and04Then8() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        double expected = 8;
        assertThat(rsl).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when30and30and62ThenNotExist() {
        Point a = new Point(3, 0);
        Point b = new Point(3, 0);
        Point c = new Point(6, 2);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        double expected = -1;
        assertThat(rsl).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when000and300and030Then9() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(3, 0, 0);
        Point c = new Point(0, 3, 0);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        double expected = 4.5;
        assertThat(rsl).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when000and300and030ThenNotExist() {
        Point a = new Point(1, 0, 0);
        Point b = new Point(1, 0, 0);
        Point c = new Point(0, 10, 0);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        double expected = -1;
        assertThat(rsl).isCloseTo(expected, offset(0.001));
    }

}