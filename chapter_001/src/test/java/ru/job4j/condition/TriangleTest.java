package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * Tests for Triangle.
 *
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class TriangleTest {
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        // Create Points.
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        // Create Triangle.
        Triangle triangle = new Triangle(a, b, c);
        // Calculate Area.
        double result = triangle.area();
        // Expected result.
        double expected = 8D;
        // Check result.
        assertThat(result, closeTo(expected, 0.1));
    }
}