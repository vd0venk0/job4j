package ru.job4j.ex;

/**
 * 0.1. java.lang.NullPointerException [#219364]
 * Программа находит максимальную длину строки среди массива строк.
 */

public class FindMaxLength {
    public static void main(String[] args) {
        String[] shops = {"Ebay", null, "Amazon", null, "Ozon"};
        int max = 0;
        for (int index = 0; index < shops.length; index++) {
            if (shops[index] != null) {
                String el = shops[index];
                if (el.length() > max) {
                    max = el.length();
                }
            }
        }
        System.out.println("Max length : " + max);
    }
}