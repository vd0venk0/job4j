package ru.job4j.loop;

/**
 * Factorial.
 *
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com).
 */
public class Factorial {

    /**
     * Метод возвращает факториал введенного числа.
     * @param n Введенное число.
     * @return Факториал введенного числа.
     */
    public int calc(int n) {
        int factorial = 1;
        if (n != 0) {
            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }
        }
        return factorial;
    }
}
