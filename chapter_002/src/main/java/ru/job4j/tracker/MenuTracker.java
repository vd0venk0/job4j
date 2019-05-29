package ru.job4j.tracker;

import java.util.*;

/**
 * MenuTracker.
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com)
 * @version $Id$
 * @since 0.1.
 */

public class MenuTracker {
    private Input input;
    private Tracker tracker;
    private List<UserAction> actions = new ArrayList<>();
    private static final String ADD = "0"; // Добавление новой заявки.
    private static final String SHOWALL = "1"; // Отображение всех заявок.
    private static final String EDIT = "2"; // Изменение заявки.
    private static final String DELETE = "3"; // Удаление заявки.
    private static final String FINDBYID = "4"; // Поиск заявки по ID.
    private static final String FINDBYNAME = "5"; // Поиск заявки по имени.
    private static final String EXIT = "6"; // Выход из меню.

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
     * Метод заполняет массив.
     */
    public void fillActions() {
        this.actions.add(new AddItem(0, "Add program"));
        this.actions.add(new ShowAllItems(1, "Show all items"));
        this.actions.add(new EditTheItem(2, "Edit item"));
        this.actions.add(new DeleteTheItem(3, "Delete item"));
        this.actions.add(new FindItemByID(4, "Find Item By ID"));
        this.actions.add(new FindItemByName(5, "Find Item By Name"));
        this.actions.add(new ExitProgram(6, "Exit"));
    }

    /**
     * Метод в зависимости от указанного ключа, выполняет соотвествующие действие.
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

    /**
     * Внутренний класс для добавления заявки в трекер.
     */
    public class AddItem implements UserAction {
        int key;
        String desc;
        public AddItem(int key, String desc) {
            this.key = key;
            this.desc = desc;
        }

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
        }

        @Override
        public String info() {
            return "0. Add New Item";
        }
    }

    /**
     * Внутрениий класс для отображения всех заявок в трекере.
     */
    private class ShowAllItems implements UserAction {
        int key;
        String desc;
        public ShowAllItems(int key, String desc) {
            this.key = key;
            this.desc = desc;
        }

        @Override
        public int key() {
            return Integer.valueOf(SHOWALL);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("+++++++++++++++++ Список заявок +++++++++++++++++++");
            for (Item item : tracker.findAll()) {
                item.printItem();
            }
        }

        @Override
        public String info() {
            return ("1. Show All Items");
        }
    }

    /**
     * Внутренний класс для изменения элемента в трекере.
     */
    private class EditTheItem implements UserAction {
        int key;
        String desc;
        public EditTheItem(int key, String desc) {
            this.key = key;
            this.desc = desc;
        }
        @Override
        public int key() {
            return Integer.valueOf(EDIT);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("+++++++++++++++ Изменение заявки ++++++++++++++++++");
            String id = input.ask("Введите ID изменяемой заявки: ");
            Item foundItem = tracker.findById(id);
            if (foundItem != null) {
                Item item = foundItem;
                item.name = input.ask("Введите имя заявки :");
                item.description = input.ask("Введите описание заявки :");
                item.setId(id);
                tracker.replace(id, item);
                System.out.println("Заявка ID = " + id + " успешно изменена.");
            } else {
                System.out.println("Заявка ID = " + id + " не найдена.");
            }
        }

        @Override
        public String info() {
            return ("2. Edit item");
        }
    }

    /**
     * Внутренний класс для удаление элемента в трекере.
     */
    private class DeleteTheItem implements UserAction {
        int key;
        String desc;
        public DeleteTheItem(int key, String desc) {
            this.key = key;
            this.desc = desc;
        }

        @Override
        public int key() {
            return Integer.valueOf(DELETE);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("++++++++++++++++ Удаление заявки ++++++++++++++++++");
            String id = input.ask("Введите ID удаляемой заявки: ");
            if (tracker.findById(id) != null) {
                tracker.delete(id);
                System.out.println("Заявка ID = " + id + " успешно удалена.");
            } else {
                System.out.println("Заявка ID = " + id + " не найдена.");
            }
        }

        @Override
        public String info() {
            return ("3. Delete item");
        }
    }

    /**
     * Внутренний класс для поиска элемента в трекере по ID.
     */
    private class FindItemByID implements UserAction {
        int key;
        String desc;
        public FindItemByID(int key, String desc) {
            this.key = key;
            this.desc = desc;
        }
        @Override
        public int key() {
            return Integer.valueOf(FINDBYID);
        }
        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("+++++++++++++++ Поиск заявки по ID ++++++++++++++++");
            String id = input.ask("Введите ID заявки для поиска: ");
            Item foundItem = tracker.findById(id);
            if (foundItem != null) {
                System.out.println("Заявка ID = " + id + " успешно найдена:");
                foundItem.printItem();
            } else {
                System.out.println("Заявка с ID " + id + " не найдена.");
            }
        }
        @Override
        public String info() {
            return ("4. Find Item by ID");
        }
    }

    /**
     * Внутренний класс для поиска элемента в трекере по имени.
     */
    private class FindItemByName implements UserAction {
        int key;
        String desc;
        public FindItemByName(int key, String desc) {
            this.key = key;
            this.desc = desc;
        }
        @Override
        public int key() {
            return Integer.valueOf(FINDBYNAME);
        }
        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("+++++++++++++++ Поиск заявки по имени ++++++++++++++++");
            String name = input.ask("Введите имя заявки для поиска: ");
            Item[] items = tracker.findByName(name);
            if (items.length != 0) {
                System.out.println("Результаты поиска заявок с именем " + name + ":");
                for (Item item : items) {
                    item.printItem();
                }
            } else {
                System.out.println("Заявки с именем " + name + " не найдены.");
            }
        }
        @Override
        public String info() {
            return ("5. Find Item by Name");
        }
    }

    /**
     * Внутренний класс для выхода из трекера.
     */
    private class ExitProgram implements UserAction {
        int key;
        String desc;
        public ExitProgram(int key, String desc) {
            this.key = key;
            this.desc = desc;
        }
        @Override
        public int key() {
            return Integer.valueOf(EXIT);
        }
        @Override
        public void execute(Input input, Tracker tracker) {
            boolean exit = false;
            while (!exit) {
                if (key == key()) {
                    exit = true;
                }
            }
        }
        @Override
        public String info() {
            return ("6. Exit");
        }
    }
}
