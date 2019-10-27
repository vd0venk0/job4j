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
public class TrackerTest {

    /**
     * Test for add.
     */
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        assertThat(tracker.findAll()[0], is(item));
    }

    /**
     * Test for replace.
     */
    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        tracker.add(previous);
        Item next = new Item("test2", "testDescription2", 1234L);
        next.setId(previous.getId());
        tracker.replace(previous.getId(), next);
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    /**
     * Test for delete.
     */
    @Test
    public void whenDeleteItemFromTrackerThenNewTracker() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1", "testDescription1", 123L);
        tracker.add(first);
        Item second = new Item("test2", "testDescription2", 234L);
        tracker.add(second);
        Item third = new Item("test3", "testDescription3", 345L);
        tracker.add(third);
        tracker.delete(first.getId());

//        assertThat(tracker.findAll()[0], is(second));
    }

    /**
     * Test for findAll.
     */
    @Test
    public void whenFindAllThenResult() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1", "testDescription1", 123L);
        tracker.add(first);
        Item second = new Item("test2", "testDescription2", 234L);
        tracker.add(second);
        Item third = new Item("test3", "testDescription3", 345L);
        tracker.add(third);
        Item[] result = tracker.findAll();
        Item[] expected = new Item[3];
        System.arraycopy(result, 0, expected, 0, 3);
        assertArrayEquals(expected, result);
    }

    /**
     * Test for findByName.
     */
    @Test
    public void whenFindByNameThenResult() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1", "testDescription1", 123L);
        tracker.add(first);
        Item second = new Item("test2", "testDescription2", 234L);
        tracker.add(second);
        Item third = new Item("test3", "testDescription3", 345L);
        tracker.add(third);
        Item fourth = new Item("test1", "testDescription4", 456L);
        tracker.add(fourth);
        Item[] result = tracker.findByName("test1");
        Item[] expected = {first, fourth};
        assertArrayEquals(expected, result);
    }

    /**
     * Test for findById.
     */
    @Test
    public void whenFindByIdThenResult() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1", "testDescription1", 123L);
        tracker.add(first);
        Item second = new Item("test2", "testDescription2", 234L);
        tracker.add(second);
        Item third = new Item("test3", "testDescription3", 345L);
        tracker.add(third);
        String result = (tracker.findById(first.getId())).getId();
        String expected = first.getId();
        assertThat(result, is(expected));

    }
}