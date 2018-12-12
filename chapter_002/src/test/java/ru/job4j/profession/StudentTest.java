package ru.job4j.profession;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class StudentTest {
    /**
     * Test for Student.
     */
    @Test
    public void whenStudentSkillIs50() {
        int studentSkill = 50;
        Profession teacher = new Teacher();
        Student student = new Student(studentSkill);
        int result = ((Teacher) teacher).teach(student);
        int expect = 50;
        assertThat(result, is(expect));
    }
}
