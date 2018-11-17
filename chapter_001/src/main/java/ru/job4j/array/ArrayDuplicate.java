package ru.job4j.array;

import java.util.Arrays;
/**
 * ArrayDuplicate.
 * Удаление дублей в массиве.
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com).
 */
public class ArrayDuplicate {
    /**
     * Метод удаляет дубли в массиве и возвращает массив без дублей.
     * @param array Входящий массив.
     * @return Массив без дублей.
     */
    public String[] remove(String[] array) {
        int unique = array.length;
        for (int out = 0; out < unique; out++) {
            for (int in = out + 1; in < unique; in++) {
                if (array[out].equals(array[in])) {
                    array[in] = array[unique - 1];
                    unique--;
                    in--;
                }
            }
        }
        return Arrays.copyOf(array, unique);
    }
}
