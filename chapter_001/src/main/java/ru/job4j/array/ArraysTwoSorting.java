package ru.job4j.array;
/**
 * ArraysTwoSorting.
 * Преобразование двух сортированных массивов в один сортированный массив.
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com).
 */
public class ArraysTwoSorting {
    /**
     * Метод преобразует два входящих сортированных массива в один сортированный массив.
     * @param firstsArray Первый входной сортированный массив.
     * @param secondArray Второй входной сортированных массив.
     * @return Результирующий сортированный массив.
     */
    public int[] sorting(int[] firstsArray, int[] secondArray) {
        int[] sortArray = new int[firstsArray.length + secondArray.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (k <= sortArray.length) {
            if (i < firstsArray.length) {
                if (firstsArray[i] <= secondArray[j]) {
                    sortArray[k] = firstsArray[i];
                    i++;
                } else {
                    sortArray[k] = secondArray[j];
                    j++;
                }
            } else if (j < secondArray.length) {
                sortArray[k] = secondArray[j];
                j++;
            }
            k++;
        }
        return sortArray;
    }
}