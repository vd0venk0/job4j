package ru.job4j.array;
/**
 * FindLoop.
 * Поиск в массиве определенного элемента и возвращение его индекса.
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com).
 */
public class FindLoop {
    /**
     * Метод ищет в массиве определенный элемент и возвращает его индекс.
     * @param data Массив для поиска.
     * @param el Элемент для поиска.
     * @return Индекс найденного элемента.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1; // Если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}