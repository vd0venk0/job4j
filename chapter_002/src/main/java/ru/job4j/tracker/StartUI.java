package ru.job4j.tracker;

/**
 * StartUI
 * Реализация пользовательского интерфейса.
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class StartUI {
    /**
     * Константы меню.
     */
    private static final String ADD = "0"; // Добавление новой заявки.
    private static final String SHOWALL = "1"; // Отображение всех заявок.
    private static final String EDIT = "2"; // Изменение заявки.
    private static final String DELETE = "3"; // Удаление заявки.
    private static final String FINDBYID = "4"; // Поиск заявки по ID.
    private static final String FINDBYNAME = "5"; // Поиск заявки по имени.
    private static final String EXIT = "6"; // Выход из меню.
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
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Select menu item : ");
            if (ADD.equals(answer)) {
                //добавление заявки вынесено в отдельный метод.
                this.createItem();
            } else if (SHOWALL.equals(answer)) {
                this.showAllItems();
            } else if (EDIT.equals(answer)) {
                this.editTheItem();
            } else if (DELETE.equals(answer)) {
                this.deleteTheItem();
            } else if (FINDBYID.equals(answer)) {
                this.findItemByID();
            } else if (FINDBYNAME.equals(answer)) {
                this.findItemByName();
            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }
    }

    private void showMenu() {
        System.out.println("========== Menu: ==========");
        System.out.println("0. Add New Item");
        System.out.println("1. Show All Items");
        System.out.println("2. Edit Item");
        System.out.println("3. Delete Item");
        System.out.println("4. Find Item By ID");
        System.out.println("5. Find Items By Name");
        System.out.println("6. Exit Program");
        System.out.println("===========================");
    }

    /**
     * Метод реализует добавление новой заявки в хранилище.
     */
    private void createItem() {
        System.out.println("++++++++++++ Добавление новой заявки ++++++++++++++");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        Item item = new Item(name, desc);
        this.tracker.add(item);
        System.out.println("++++ Создана новая заявка с getId : " + item.getId() + " ++++");
    }

    /**
     * Метод реализует отображение списка всех заявок.
     */
    private void showAllItems() {
        System.out.println("+++++++++++++++++ Список заявок +++++++++++++++++++");
        for (Item item : tracker.findAll()) {
            System.out.println("---------------------------");
            System.out.println("Имя заявки: " + item.getName());
            System.out.println("Описание:   " + item.getDescription());
            System.out.println("ID заявки:  " + item.getId());
            System.out.println("---------------------------");
        }
    }

    /**
     * Метод реализует изменение заявки.
     */
    private void editTheItem() {
        System.out.println("+++++++++++++++ Изменение заявки ++++++++++++++++++");
        String id = this.input.ask("Введите ID изменяемой заявки: ");
        for (Item item : tracker.findAll()) {
            if (id.equals(item.getId())) {
                String name = this.input.ask("Введите имя заявки :");
                String desc = this.input.ask("Введите описание заявки :");
                item.setId(id);
                item.name = name;
                item.description = desc;
                this.tracker.replace(id, item);
                System.out.println("Заявка ID = " + id + " успешно изменена.");
                break;
            }
        }
    }

    /**
     * Метод реализует изменение заявки.
     */
    private void deleteTheItem() {
        System.out.println("++++++++++++++++ Удаление заявки ++++++++++++++++++");
        String id = this.input.ask("Введите ID удаляемой заявки: ");
        for (Item item : tracker.findAll()) {
            if (id.equals(item.getId())) {
                this.tracker.delete(id);
                System.out.println("Заявка ID = " + id + " успешно удалена.");
                break;
            }
        }
    }

    /**
     * Метод реализует поиск заявки по ID.
     */
    private void findItemByID() {
        System.out.println("+++++++++++++++ Поиск заявки по ID ++++++++++++++++");
        String id = this.input.ask("Введите ID заявки для поиска: ");
        for (Item item : tracker.findAll()) {
            if (id.equals(item.getId())) {
                System.out.println("Заявка ID = " + id + " успешно найдена:");
                System.out.println("---------------------------");
                System.out.println("Имя заявки: " + item.getName());
                System.out.println("Описание:   " + item.getDescription());
                System.out.println("ID заявки:  " + item.getId());
                System.out.println("---------------------------");
                break;
            }
        }
    }

    /**
     * Метод реализует поиск заявки по имени.
     */
    private void findItemByName() {
        System.out.println("+++++++++++++++ Поиск заявки по имени ++++++++++++++++");
        String name = this.input.ask("Введите имя заявки для поиска: ");
        for (Item item : tracker.findAll()) {
            if (name.equals(item.getName())) {
                System.out.println("Заявка c именем = " + name + " успешно найдена:");
                System.out.println("---------------------------");
                System.out.println("Имя заявки: " + item.getName());
                System.out.println("Описание:   " + item.getDescription());
                System.out.println("ID заявки:  " + item.getId());
                System.out.println("---------------------------");
                break;
            }
        }
    }

    /**
     * Запуск программы.
     * @param args Аргументы.
     */
    public static void main(String[] args) {
        ConsoleInput input = new ConsoleInput();
        //String name = input.ask("Please enter the task's name:");
        Tracker tracker = new Tracker();
        //tracker.add(new Task(name, "first desc"));
        for (Item item : tracker.findAll()) {
            System.out.println(item.getName());
        }
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}