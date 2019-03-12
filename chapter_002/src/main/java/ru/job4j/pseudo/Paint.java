package ru.job4j.pseudo;

/**
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Paint {

    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }

    /**
     * Проверяем вывод в консоли.
     * @param args Аргументы.
     */
    public static void main(String[] args) {
        Paint paint = new Paint();
        paint.draw(new Triangle());
        paint.draw(new Square());
    }
}
