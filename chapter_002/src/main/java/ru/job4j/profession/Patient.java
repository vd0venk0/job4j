package ru.job4j.profession;
/**
 * Пациент.
 *
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com)
 */
public class Patient {
    String health;

    public Patient() {

    }

    /**
     * Возвращаем уровень здоровья пациента.
     * @param health Уровень здоровья (диагноз).
     */
    public Patient(String health) {
        this.health = health;
    }

}
