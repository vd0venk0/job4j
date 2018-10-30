package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * Tests for Point.
 *
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class PointTest {

    /**
     * Test for distanceTo.
     */
    @Test
    public void distanceTo() {
        Point a = new Point(0, 0);
        Point b = new Point(3, 4);
        assertThat(a.distanceTo(b), closeTo(5, 0));
    }
}
