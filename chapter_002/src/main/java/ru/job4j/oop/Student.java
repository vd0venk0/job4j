package ru.job4j.oop;
/**
 * Student.
 *
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com)
 */
public class Student {

    public void song() {
        System.out.println("I believe I can fly");
    }

    public void misic() {
        System.out.println("Tra tra tra");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        for (int i = 0; i < 3; i++) {
            petya.misic();
            petya.song();
        }
    }
}