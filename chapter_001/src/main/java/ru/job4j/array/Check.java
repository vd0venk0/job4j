package ru.job4j.array;
/**
 * Check.
 * Проверка на однородность массива.
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com).
 */
public class Check {
    /**
     * Метод должен проверить, что все элементы в массиве являются true или false.
     * @param data Входной массив.
     * @return Результат проверки.
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            if (data[0] != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}