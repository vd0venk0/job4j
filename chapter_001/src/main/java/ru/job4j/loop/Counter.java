package ru.job4j.loop;

/**
 * Counter.
 *
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com).
 */
public class Counter {

    /**
     * Method for summing even numbers ranging from start to finish.
     * @param start Initial number of range.
     * @param finish End number of range.
     * @return The sum of even numbers in the range.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
