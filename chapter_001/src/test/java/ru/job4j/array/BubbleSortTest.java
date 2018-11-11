package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Tests for BubbleSort.
 *
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class BubbleSortTest {
    /**
     * Тест на проверку сортировки.
     */
    @Test
    public void when51273Then12357() {
        int[] array = {5, 1, 2, 7, 3};
        int[] answer = {1, 2, 3, 5, 7};
        BubbleSort bubbleSort = new BubbleSort();
        int[] result = bubbleSort.sort(array);
        assertThat(result, is(answer));
    }
}