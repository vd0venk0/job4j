package ru.job4j.array;

/**
 * BubbleSort.
 * Сортировка массива.
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com).
 */
public class BubbleSort {

    /**
     * Метод сортирует входящий массив.
     * @param array Входной массив.
     * @return Сортированный массив.
     */
    public int[] sort(int[] array) {
        boolean isSorted = false;
        int buffer;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    buffer = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buffer;
                }
            }
        }
        return array;
    }
}
