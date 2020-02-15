package ru.job4j.oop;
/**
 * Jukebox.
 *
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com)
 */
public class Jukebox {

    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неулюже...");
        } else if (position == 2) {
            System.out.println("Спокойной ночи, малыши...");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox jukebox = new Jukebox();
        for (int i = 1; i < 4; i++) {
            jukebox.music(i);
        }
    }
}
