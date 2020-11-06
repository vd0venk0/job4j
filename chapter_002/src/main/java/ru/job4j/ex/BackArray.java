package ru.job4j.ex;

/**
 * 0. Что такое исключение. [#3821]
 * Исправление ошибок.
 */

import java.util.Arrays;

/**
 * 0. Что такое исключение. [#3821]
 * Переворачиваем массив наоборот.
 */

public class BackArray {
    public static void main(String[] args) {
        String[] names = {"Petr", "Ivan", "Nik", "Vasya"};
        int middle = names.length / 2;
        for (int index = 0; index < middle; index++) {
            String temp = names[index];
            names[index] = names[names.length - index - 1];
            names[names.length - index - 1] = temp;
        }
        System.out.println(Arrays.toString(names));
    }
}
