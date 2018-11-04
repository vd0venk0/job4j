package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Tests for Factorial.
 *
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class FactorialTest {

    /**
     * Test for factorial 5.
     */
    @Test
    public void whenInput5ThenFactor120() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(5);
        assertThat(result, is(120));
    }

    /**
     * Test for factorial 0.
     */
    @Test
    public void whenInput0ThenFactor1() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(0);
        assertThat(result, is(1));
    }
}
