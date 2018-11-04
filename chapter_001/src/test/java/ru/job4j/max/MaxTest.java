package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тесты для программы поиска максимального числа.
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class MaxTest {

    /**
     * Тест, когда первое меньше второго.
     */
    @Test
    public void whenFirstLessSecond() {
        Max max = new Max();
        int result = max.max(1, 2);
        assertThat(result, is(2));
    }

    /**
     * Тест, когда первое больше второго.
      */
    @Test
    public void whenFirstMoreSecond() {
        Max max = new Max();
        int result = max.max(3, 1);
        assertThat(result, is(3));
    }

    @Test
    public void whenThreeDigitThenMax() {
        Max max = new Max();
        int result = max.max(1, 2, 10);
        assertThat(result, is(10));
    }
}
