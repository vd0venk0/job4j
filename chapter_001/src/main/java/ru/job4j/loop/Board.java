package ru.job4j.loop;

/**
 * Board.
 *
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
    /** // Проверка с выводом на консоль:
    public static void main(String[] args) {
        Board board = new Board();
        System.out.println(board.paint(5, 5));
    }*/
}
