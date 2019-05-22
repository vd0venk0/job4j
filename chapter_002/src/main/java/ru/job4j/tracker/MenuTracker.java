package ru.job4j.tracker;

import javafx.concurrent.Task;
import java.util.*;

public class MenuTracker {
    private Input input;
    private Tracker tracker;
    private List<UserAction> actions = new ArrayList<>();
    private static final String ADD = "1";

    /**
     * Конструктор.
     * @param input Объект типа Input.
     * @param tracker Объект типа Tracker.
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Метод для получения массива меню.
     *
     * @return длину массива
     */
    public int getActionsLentgh() {
        return this.actions.size();
    }

    /**
     * Метод заполняет массив.
     */
    public void fillActions() {
        this.actions.add(new AddItem(1, "Add program"));
        this.actions.add(new ShowItems(1, "Show all items"));
        this.actions.add(new UpdateItem(2, "Edit item"));
        this.actions.add(new DeleteItem(3, "Delete item"));
        this.actions.add(new FindItemById(4, "Find item by Id"));
        this.actions.add(new FindItemsByName(5, "Find items by name"));
        this.actions.add(new ExitProgram(6, "Exit Program"));
    }

    /**
     * Метод в зависимости от указанного ключа, выполняет соотвествующие действие.
     *
     * @param key ключ операции
     */
    public void select(int key) {
        this.actions.get(key).execute(this.input, this.tracker);
    }

    /**
     * Метод выводит на экран меню.
     */
    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    public class AddItem implements UserAction {
        @Override
        public int key() {
            return Integer.valueOf(ADD);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("++++++++++++ Добавление новой заявки ++++++++++++++");
            String name = input.ask("Введите имя заявки :");
            String desc = input.ask("Введите описание заявки :");
            Item item = new Item(name, desc);
            tracker.add(item);

            System.out.println("+++++ Создана новая заявка с ID : " + item.getId() + " +++++");
            item.printItem();
//            System.out.println("------------ New Item with Id : " + item.getId());
//            System.out.println("------------ New Item with Name : " + item.getName());
//            System.out.println("------------ New Item with Description : " + item.getDesc());
        }

        @Override
        public String info() {
            return "Add new Item.";
        }
    }
}
