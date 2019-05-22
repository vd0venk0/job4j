package ru.job4j.tracker;

public interface UserAction {
    /**
     * Метод возвращает ключ опции.
     * @return Ключ опции.
     */
    int key();

    /**
     * Основной метод.
     * @param input Объект типа Input.
     * @param tracker Объект типа Tracker.
     */
    void execute(Input input, Tracker tracker);

    /**
     * Метод возвращает информацию о данном пункте меню.
     * @return Строка меню.
     */
    String info();
}
