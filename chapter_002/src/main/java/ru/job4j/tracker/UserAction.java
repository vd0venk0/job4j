package ru.job4j.tracker;

/**
 * Интерфейс UserAction.
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com).
 * @version $Id$
 * @since 0.1.
 */

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
