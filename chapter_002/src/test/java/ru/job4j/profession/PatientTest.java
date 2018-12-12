package ru.job4j.profession;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class PatientTest {
    /**
     * Test for Patient.
     */
    @Test
    public void whenPatientHealthIsGood() {
        String patientHealth = "Good";
        Profession doctor = new Doctor();
        Patient patient = new Patient(patientHealth);
        String result = ((Doctor) doctor).diagnose(patient);
        String expect = "Good";
        assertThat(result, is(expect));
    }
}
