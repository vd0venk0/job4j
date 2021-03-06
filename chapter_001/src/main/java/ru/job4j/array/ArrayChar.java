package ru.job4j.array;
/**
 * ArrayChar.
 * Проверка, что слово начинается с префикса.
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com).
 */
public class ArrayChar {
    private char[] data;

    /**
     * Обёртка над строкой.
     * @param line Входящая строка.
     */
    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Метод проверяет, что слово начинается с префикса.
     * @param prefix Префикс для проверки.
     * @return Результат проверки.
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        for (int i = 0; i < value.length; i++) {
            if (value[i] != data [i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}