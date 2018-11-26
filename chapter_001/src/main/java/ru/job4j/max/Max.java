package ru.job4j.max;

/**
 * Max.
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
    public int max(int first, int second) {
        return (first > second) ? first : second;
    }

    /**
     * Метод возвращает максимумальное из трех введенных чисел.
     * @param first Первое число.
     * @param second Второе число.
     * @param third Третье число.
     * @return Максимальное из трех чисел.
     */
    public int max(int first, int second, int third) {
        return this.max(this.max(first, second), third);
    }
}
