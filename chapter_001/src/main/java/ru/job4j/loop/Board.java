package ru.job4j.loop;

/**
 * Board.
 * Рисуем шахматную доску.
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com).
 */
public class Board {

    /**
     * Метод рисует шахматную доску.
     * @param width Ширина доски.
     * @param height Высота доски.
     * @return Доска.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i + j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}
