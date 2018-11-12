package ru.job4j.array;
/**
 * Matrix.
 * Построение матрицы заданного размера.
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com).
 */
public class Matrix {
    /**
     * Метод строит матрицу заданного размера.
     * @param size Размер матрицы.
     * @return Матрица.
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
