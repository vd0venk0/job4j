package ru.job4j.tracker;

        import java.util.List;
        import java.util.Scanner;

/**
 * ConsoleInput.
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com)
 * @version $Id$
 * @since 0.1.
 */

public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);

    public String ask(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }

    public String ask(String question, List<Integer> range) {
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int value : range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (exist) {
            return Integer.toString(key);
        } else {
            throw new MenuOutException("Out of menu range.");
        }
    }
}