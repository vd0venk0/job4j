package ru.job4j.array;
/**
 * Turn.
 * Переворот входного массива.
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com).
 */
public class Turn {
    /**
     * Метод переворачивает входной массив.
     * @param array Входной массив.
     * @return Перевернутый массив.
     */
    public int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}
