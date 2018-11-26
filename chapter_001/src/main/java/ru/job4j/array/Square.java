package ru.job4j.array;
/**
 * Square.
 * Генерация массива квадратов чисел на основании длины  массива.
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com).
 */
public class Square {

    /**
     * Метод возвращает массив квадратов чисел на основании введенной длины массива.
     * @param bound Длина массива.
     * @return Массив квадратов чисел.
     */
    public int[] calculate(int bound) {
        int[] result = new int[bound];
        for (int i = 0; i < bound; i++) {
            result[i] = (int) Math.pow((double) i + 1, 2D);
        }
        return result;
    }
}
