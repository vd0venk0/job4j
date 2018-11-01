package ru.job4j.max;

/**
 * Программа для поиска максимального числа из двух введенных.
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com).
 */
public class Max {

    /**
     * Метод поиска максимального числа из двух введенных.
     * @param first Первое число.
     * @param second Второе число.
     * @return Максимальное число.
     */
    public int maximum(int first, int second) {
        return (first > second) ? first : second;
    }
}
