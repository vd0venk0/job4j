package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * Tracker.
 * Реализация трекера.
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com)
 */
public class Tracker {
    private Item[] items = new Item[100];
    private int position = 0;
    private static final Random RN = new Random();

    /**
     * Метод добавляет заявку в трекер.
     * @param item Элемент.
     * @return Элемент.
     */
    public Item add(Item item) {
        item.setId(this.generateID());
        this.items[position++] = item;
        return item;
    }

    /**
     * Заменяем элемент в трекере.
     * @param id ID заменяемого элемента.
     * @param item Новый элемент.
     * @return Результат замены.
     */
    public boolean replace(String id, Item item) {
        boolean replaceResult = false;
        // Ищем элемент по id и получаем его индекс.
        Item result = null;
        int index = 0;
        for (int i = 0; i < this.items.length; i++) {
            if (items[i] != null && items[i].getId().equals(id)) {
                result = items[i];
                index = i;
                break;
            }
        }
        // Делаем замену в массиве элементов согласно найденного индекса.
        if (result != null) {
            this.items[index] = item;
            replaceResult = true;
        }
        return replaceResult;
    }

    /**
     * Метод должен удалить ячейку в массиве this.items.
     * @param id ID удаляемого элемента.
     */
    public boolean delete(String id) {
        boolean resultOfDelete = false;
        // Ищем элемент по id и получаем его индекс.
        Item result = null;
        int index = 0;
        for (int i = 0; i < position; i++) {
            if (items[i] != null && items[i].getId().equals(id)) {
                result = items[i];
                index = i;
                break;
            }
        }
        // Делаем удаление в массиве элементов согласно найденного индекса.
        if (result != null && index != this.items.length - 1) {
            System.arraycopy(this.items, index + 1, this.items, index, this.items.length - index - 1);
            position--;
        } else if (index == this.items.length - 1) {
            this.items[index] = null;
            position--;
        }
        if (result != null) {
            resultOfDelete = true;
        }
        return resultOfDelete;
    }

    /**
     * Метод возвращает копию массива this.items без null элементов.
     * @return Все элементы трекера.
     */
    public Item[] findAll() {
        return Arrays.copyOf(items, position); //findAllItems;
    }

    /**
     * Поиск элемента трекера по имени.
     * @param key Имя для поиска.
     * @return Найденные элементы.
     */
    public Item[] findByName(String key) {
        Item[] findByNameItems = new Item[position];
        int j = 0; // Количество найденных по имени элементов.
        for (int i = 0; i < position; i++) {
            if (this.items[i] != null && this.items[i].getName().equals(key)) {
                findByNameItems[j] = this.items[i];
                j++;
            }
        }
        return Arrays.copyOf(findByNameItems, j);
    }

    /**
     * Поиск элемента по ID.
     * @param id ID для поиска.
     * @return Найденный элемент.
     */
    public Item findById(String id) {
            Item result = null;
            for (Item item : this.items) {
                if (item != null && item.getId().equals(id)) {
                    result = item;
                    break;
                }
            }
            return result;
    }

    /**
     * Генерация ID элемента.
     * @return Сгенерированный ID.
     */
    public String generateID() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }
}