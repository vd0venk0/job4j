package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.*;
/**
 * Tests for ArraysTwoSorting.
 *
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class ArraysTwoSortingTest {
    /**
     * Тест для четных и нечетных сортированных массивов.
     */
    @Test
    public void whenEvenAndOddArraysThenSortedArray() {
        int[] firstArray = {1, 3, 5};
        int[] secondArray = {2, 4, 6};
        int[] exception = {1, 2, 3, 4, 5, 6};
        ArraysTwoSorting arraysTwoSorting = new ArraysTwoSorting();
        int[] result = arraysTwoSorting.sorting(firstArray, secondArray);
        assertArrayEquals(exception, result);
    }

    /**
     * Тест для массивов с повторениями.
     */
    @Test
    public void whenArraysWithRepetitionsThenSortedArray() {
        int[] firstArray = {1, 3, 3, 5};
        int[] secondArray = {1, 2, 4, 6};
        int[] exception = {1, 1, 2, 3, 3, 4, 5, 6};
        ArraysTwoSorting arraysTwoSorting = new ArraysTwoSorting();
        int[] result = arraysTwoSorting.sorting(firstArray, secondArray);
        assertArrayEquals(exception, result);
    }

    /**
     * Тест для массивов разной длины.
     */
    @Test
    public void whenArraysWithDifferentLengthsThenSortedArray() {
        int[] firstArray = {1, 3, 5};
        int[] secondArray = {0, 2, 4, 6, 7, 8};
        int[] exception = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        ArraysTwoSorting arraysTwoSorting = new ArraysTwoSorting();
        int[] result = arraysTwoSorting.sorting(firstArray, secondArray);
        assertArrayEquals(exception, result);
    }

}
