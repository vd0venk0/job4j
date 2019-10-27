package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Tests for ArrayChar.
 *
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class StartUITest {

    final PrintStream stdout = System.out;
    final ByteArrayOutputStream out = new ByteArrayOutputStream();

    /**
     * Константа Меню.
     * Уменьшаем объем тестов.
     */
    final StringBuilder menu = new StringBuilder()
            .append("0. Add New Item")
            .append(System.lineSeparator())
            .append("1. Show All Items")
            .append(System.lineSeparator())
            .append("2. Edit Item")
            .append(System.lineSeparator())
            .append("3. Delete Item")
            .append(System.lineSeparator())
            .append("4. Find Item By ID")
            .append(System.lineSeparator())
            .append("5. Find Items By Name")
            .append(System.lineSeparator())
            .append("6. Exit")
            .append(System.lineSeparator());

    /**
     * Before.
     * Настраиваем вывод в байтовый массив.
     */
    @Before
    public void loadOutput() {
        System.setOut(new PrintStream(out));
    }

    /**
     * After.
     * Возвращаем стандартный вывод.
     */
    @After
    public void backOutput() {
        System.setOut(this.stdout);
    }

    /**
     * Test for ADD Item.
     * Используем рефакторинг теста @Before @After.
     */
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        // Создаём Tracker.
        Tracker tracker = new Tracker();
        //Создаём StubInput с последовательностью действий пользователя(имитируем действия пользователя).
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});
        // Создаём StartUI и вызываем метод init().
        new StartUI(input, tracker).init();
        // Проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
        Item item = tracker.findAll()[0]; // Получаем нулевой элемент.
        assertThat(item.getName(), is("test name"));
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append(menu)
                                .append("++++++++++++ Добавление новой заявки ++++++++++++++")
                                .append(System.lineSeparator())
                                .append("+++++ Создана новая заявка с ID : ")
                                .append(item.getId())
                                .append(" +++++")
                                .append(System.lineSeparator())
                                .append("---------------------------")
                                .append(System.lineSeparator())
                                .append("Имя заявки: ")
                                .append(item.getName())
                                .append(System.lineSeparator())
                                .append("Описание:   ")
                                .append(item.getDescription())
                                .append(System.lineSeparator())
                                .append("ID заявки:  ")
                                .append(item.getId())
                                .append(System.lineSeparator())
                                .append("---------------------------")
                                .append(System.lineSeparator())
                                .append(menu)
                                .append("The End.")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
    }

    /**
     * Test for EDIT Item.
     * Используем рефакторинг теста @Before @After.
     */
    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name", "desc"));
        Input input = new StubInput(new String[]{"2", item.getId(), "test replace", "заменили заявку", "6"});
        new StartUI(input, tracker).init();
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append(menu)
                                .append("+++++++++++++++ Изменение заявки ++++++++++++++++++")
                                .append(System.lineSeparator())
                                .append("Заявка ID = ")
                                .append(item.getId())
                                .append(" успешно изменена.")
                                .append(System.lineSeparator())
                                .append(menu)
                                .append("The End.")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
    }

    /**
     * Test for DELETE Item.
     * Используем рефакторинг теста @Before @After.
     */
    @Test
    public void whenDeleteThenTrackerHasUpdatedValue() {
        Tracker tracker = new Tracker();
        Item item01 = tracker.add(new Item("testName01", "description01"));
        Item item02 = tracker.add(new Item("testName02", "description02"));
        Input input = new StubInput(new String[] {"3", item01.getId(), "6"});
        new StartUI(input, tracker).init();
//        assertThat(tracker.findAll()[0].getName(), is(item02.getName()));
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append(menu)
                                .append("++++++++++++++++ Удаление заявки ++++++++++++++++++")
                                .append(System.lineSeparator())
                                .append("Заявка ID = ")
                                .append(item01.getId())
                                .append(" успешно удалена.")
                                .append(System.lineSeparator())
                                .append(menu)
                                .append("The End.")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
    }

    /**
     * Test for FindItemByID.
     * Используем рефакторинг теста @Before @After.
     */
    @Test
    public void whenFindItemByIDThenCorrectItem() {
        Tracker tracker = new Tracker();
        Item item01 = tracker.add(new Item("testName01", "description01"));
        Input input = new StubInput(new String[] {"4", item01.getId(), "6"});
        new StartUI(input, tracker).init();
//        assertThat(tracker.findById(item01.getId()).getId(), is(item01.getId()));
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append(menu)
                                .append("+++++++++++++++ Поиск заявки по ID ++++++++++++++++")
                                .append(System.lineSeparator())
                                .append("Заявка ID = ")
                                .append(item01.getId())
                                .append(" успешно найдена:")
                                .append(System.lineSeparator())
                                .append("---------------------------")
                                .append(System.lineSeparator())
                                .append("Имя заявки: ")
                                .append(item01.getName())
                                .append(System.lineSeparator())
                                .append("Описание:   ")
                                .append(item01.getDescription())
                                .append(System.lineSeparator())
                                .append("ID заявки:  ")
                                .append(item01.getId())
                                .append(System.lineSeparator())
                                .append("---------------------------")
                                .append(System.lineSeparator())
                                .append(menu)
                                .append("The End.")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
    }

    /**
     * Test for FindItemsByName.
     * Используем рефакторинг теста @Before @After.
     */
    @Test
    public void whenFindItemsByNameThenCorrectItems() {
        Tracker tracker = new Tracker();
        Item item01 = tracker.add(new Item("testName", "description01"));
        Item item02 = tracker.add(new Item("testName02", "description02"));
        Item item03 = tracker.add(new Item("testName", "description03"));
        Input input = new StubInput(new String[] {"5", "testName02", "6"});
        new StartUI(input, tracker).init();
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append(menu)
                                .append("+++++++++++++++ Поиск заявки по имени ++++++++++++++++")
                                .append(System.lineSeparator())
                                .append("Результаты поиска заявок с именем ")
                                .append(item02.getName())
                                .append(":")
                                .append(System.lineSeparator())
                                .append("---------------------------")
                                .append(System.lineSeparator())
                                .append("Имя заявки: ")
                                .append(item02.getName())
                                .append(System.lineSeparator())
                                .append("Описание:   ")
                                .append(item02.getDescription())
                                .append(System.lineSeparator())
                                .append("ID заявки:  ")
                                .append(item02.getId())
                                .append(System.lineSeparator())
                                .append("---------------------------")
                                .append(System.lineSeparator())
                                .append(menu)
                                .append("The End.")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
    }

    /**
     * Test for ShowAllItems.
     * Используем рефакторинг теста @Before @After.
     */
    @Test
    public void whenShowAllItemsThenCorrectItems() {
        Tracker tracker = new Tracker();
        Item item01 = tracker.add(new Item("111", "111"));
        Input input = new StubInput(new String[] {"1", "6"});
        new StartUI(input, tracker).init();
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append(menu)
                                .append("+++++++++++++++++ Список заявок +++++++++++++++++++")
                                .append(System.lineSeparator())
                                .append("---------------------------")
                                .append(System.lineSeparator())
                                .append("Имя заявки: 111")
                                .append(System.lineSeparator())
                                .append("Описание:   111")
                                .append(System.lineSeparator())
                                .append("ID заявки:  ")
                                .append(item01.getId())
                                .append(System.lineSeparator())
                                .append("---------------------------")
                                .append(System.lineSeparator())
                                .append(menu)
                                .append("The End.")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
    }
}