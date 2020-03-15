package ru.job4j.oop;
/**
 * Cat.
 *
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com)

 */

public class Cat {

    private String food;
    private String name;

    void show() {
        System.out.println(this.name);
        System.out.println(this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public String sound() {
        String voice = "may-may";
        return voice;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.eat("kotleta");
        System.out.println("There are gav's name.");
        gav.giveNick("Gav");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.eat("fish");
        System.out.println("There are black's name.");
        black.giveNick("Black");
        black.show();
        Cat peppy = new Cat();
        String say = peppy.sound();
        System.out.println("Peppy says " + say);
    }
}
