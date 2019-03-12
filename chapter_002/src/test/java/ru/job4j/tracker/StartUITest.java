package ru.job4j.tracker;

import org.junit.Test;
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
    /**
     * Test for ADD Item.
     */
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker(); // создаём Tracker.
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"}); //создаём StubInput с последовательностью действий (имитация действий пользователя).
        new StartUI(input, tracker).init(); // создаём StartUI и вызываем метод init().
        assertThat(tracker.findAll()[0].getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }

    /**
     * Test for EDIT Item.
     */
    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name", "desc"));
        Input input = new StubInput(new String[]{"2", item.getId(), "test replace", "заменили заявку", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()).getName(), is("test replace"));
    }

    /**
     * Test for DELETE Item.
     */
    @Test
    public void whenDeleteThenTrackerHasUpdatedValue() {
        Tracker tracker = new Tracker();
        Item item01 = tracker.add(new Item("testName01", "description01"));
        Item item02 = tracker.add(new Item("testName02", "description02"));
        Input input = new StubInput(new String[] {"3", item01.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is(item02.getName()));
    }

    /**
     * Test for FindItemByID.
     */
    @Test
    public void whenFindItemByIDThenCorrectItem() {
        Tracker tracker = new Tracker();
        Item item01 = tracker.add(new Item("testName01", "description01"));
        Input input = new StubInput(new String[] {"4", item01.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item01.getId()).getId(), is(item01.getId()));
    }

    /**
     * Test for FindItemsByName.
     */
    @Test
    public void whenFindItemsByNameThenCorrectItems() {
        Tracker tracker = new Tracker();
        Item item01 = tracker.add(new Item("testName", "description01"));
        Item item02 = tracker.add(new Item("testName02", "description02"));
        Item item03 = tracker.add(new Item("testName", "description03"));
        Input input = new StubInput(new String[] {"5", "testName02", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findByName("testName")[0], is(item01));
        assertThat(tracker.findByName("testName")[1], is(item03));
    }


}
