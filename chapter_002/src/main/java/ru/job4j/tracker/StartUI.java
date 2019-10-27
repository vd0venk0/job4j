package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

/**
 * StartUI.
 * Реализация пользовательского интерфейса.
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com)
 * @version $Id$
 * @since 0.1.
 */
public class StartUI {
    /**
     * Поля класса.
     */
    private final Input input; // Пользовательский ввод.
    private final Tracker tracker; // Хранилище заявок.

    /**
     * Конструтор для инициализации полей.
     * @param input ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Основой цикл программы.
     */
    public void init() {
        int answerKey;
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        List<Integer> range = new ArrayList<>();
        menu.fillActions();
        for (int i = 0; i < menu.getActionsLenght(); i++) {
            range.add(i);
        }
        do {
            menu.show();
            answerKey = Integer.valueOf(input.ask("Select menu item : ", range));
            menu.select(answerKey);
        } while (!menu.EXIT.equals(Integer.toString(answerKey)));
    }

    /**
     * Запуск программы.
     * @param args Аргументы.
     */
    public static void main(String[] args) {
        new StartUI(new ValidateInput(new ConsoleInput()), new Tracker()).init();
    }
}