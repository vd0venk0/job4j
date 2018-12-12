package ru.job4j.profession;
/**
 * Учитель.
 *
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com)
 */
public class Teacher extends Profession {

    public Teacher() {

    }

    public Teacher(String name) {
        super.name = name;
    }

    /**
     * Учим студента.
     * @param student Студент.
     * @return Уровень знаний студента.
     */
    public int teach(Student student) {
        return student.skill;
    }
}