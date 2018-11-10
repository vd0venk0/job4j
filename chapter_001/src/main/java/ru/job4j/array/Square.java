package ru.job4j.array;
/**
 * Square.
 *
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com).
 */
public class Square {

    /**
     * Метод возвращает массив квадратов чисел на основании введенной длины массива.
     * @param bound Длина массива.
     * @return Массив квадратов чисел.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < bound; i++) {
            rst[i] = (int) Math.pow((double) i + 1, 2D);
        }
        return rst;
    }
}
