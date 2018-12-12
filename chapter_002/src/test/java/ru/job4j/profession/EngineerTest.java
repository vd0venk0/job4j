package ru.job4j.profession;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class EngineerTest {
    /**
     * Test for Engineer.
     */
    @Test
    public void whenEngineerAlex() {
        String engineerName = "Alex";
        Profession engineer = new Engineer(engineerName);
        String result = engineer.getName();
        String expect = "Alex";
        assertThat(result, is(expect));
    }
}
