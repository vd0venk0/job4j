package ru.job4j.profession;
/**
 * House.
 *
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com)
 */
public class House {
    int progress;

    public House() {

    }

    /**
     * Возвращаем уровень готовности дома.
     * @param progress Уровень готовности.
     */
    public House(int progress) {
        this.progress = progress;
    }
}
