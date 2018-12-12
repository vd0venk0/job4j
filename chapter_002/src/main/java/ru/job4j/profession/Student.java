package ru.job4j.profession;
/**
 * Студент.
 *
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com)
 */
public class Student {
    int skill;

    public Student() {

    }

    /**
     * Возвращаем уровень знаний студента.
     * @param skill Уровень знаний.
     */
    public Student(int skill) {
        this.skill = skill;
    }

}
