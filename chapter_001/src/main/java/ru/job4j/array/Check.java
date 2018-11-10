package ru.job4j.array;
/**
 * Check.
 *
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com).
 */
public class Check {
    /**
     * Метод должен проверить, что все элементы в массиве являются true или false.
     * @param data Входной массив.
     * @return Результат проверки.
     */
    public boolean mono(boolean[] data) {
        boolean result = data[0];
        for (int i = 1; i < data.length; i++) {
            result &= data[i];
        }
        return result;
    }
}