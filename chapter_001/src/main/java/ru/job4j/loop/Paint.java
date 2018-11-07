package ru.job4j.loop;

/**
 * Paint.
 * Метод формирует пирамиду заданной высоты.
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com)
 */
public class Paint {

    public String pyramid(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = 2 * height - 1;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= height - column - 1 && row + height - 1 >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
//    Проверка в консоли.
//    public static void main(String[] args) {
//        Paint paint = new Paint();
//        System.out.println(paint.pyramid(3));
//    }
}