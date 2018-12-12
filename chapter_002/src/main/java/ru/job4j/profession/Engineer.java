package ru.job4j.profession;
/**
 * Engineer.
 *
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com).
 */
public class Engineer extends Profession {

    public Engineer() {

    }

    public Engineer(String name) {
        super.name = name;
    }

    /**
     * Строим дом.
     * @param house Дом.
     * @return Уровень готовности дома.
     */
    public int build(House house) {
        return house.progress;
    }
}
