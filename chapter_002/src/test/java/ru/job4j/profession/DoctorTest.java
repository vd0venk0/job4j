package ru.job4j.profession;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class DoctorTest {
    /**
     * Test for Doctor.
     */
    @Test
    public void whenDoctorJack() {
        String doctorName = "Jack";
        Profession doctor = new Doctor(doctorName);
        String result = doctor.getName();
        String expect = "Jack";
        assertThat(result, is(expect));
    }
}
