package ru.job4j.profession;
/**
 * Doctor.
 *
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com)
 */
public class Doctor extends Profession {

    public Doctor() {

    }

    public Doctor(String name) {
        super.name = name;
    }

    /**
     * Диагноз для пациента.
     * @param patient Пациент.
     * @return Диагноз (состояние здоровья).
     */

    public String diagnose(Patient patient) {
        return patient.health;
    }
}
