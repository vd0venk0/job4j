package ru.job4j.profession;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TeacherTest {
    /**
     * Test for Teacher.
     */
    @Test
    public void whenTheacherBob() {
        String teacherName = "Bob";
        Profession teacher = new Teacher(teacherName);
        String result = teacher.getName();
        String expect = "Bob";
        assertThat(result, is(expect));
    }
}
