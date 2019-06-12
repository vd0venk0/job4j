package ru.job4j.tracker;

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
        String answer;
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        menu.fillActions();
        do {
            menu.show();
            answer = this.input.ask("Select menu item : ");
            menu.select(Integer.valueOf(answer));
        } while (!"6".equals(answer));
    }

    /**
     * Запуск программы.
     * @param args Аргументы.
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}