package ru.job4j.array;
/**
 * BubbleSort.
 * Сортировка массива.
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com).
 */
public class BubbleSort {
    /**
     * Метод сортирует входящий массив.
     * @param array Входящий массив.
     * @return Сортировочный массив.
     */
    public int[] sort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int buffer = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buffer;
                }
            }
        }
        return array;
    }
}