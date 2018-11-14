package ru.job4j.array;
/**
 * MatrixCheck.
 * Проверка диагоналей матрицы на предмет монотонности.
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com).
 */
public class MatrixCheck {
    /**
     * Метод проверяет диагонали входящей матрицы на предмет монотонности.
     * @param data Входящая матрица для проверки.
     * @return Результат проверки.
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            result = data[i][i] == data[i + 1][i + 1] && data[data.length - 1 - i][data.length - 1 - i] == data[data.length - 2 - i][data.length - 2 - i];
            if (!result) {
                break;
            }
        }
        return result;
    }
}
