package ru.job4j.tracker;

import java.util.List;

/**
 * ValidateInput.
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com)
 * @version $Id$
 * @since 0.1.
 */
public class ValidateInput extends ConsoleInput {
    public int ask(String question, List<Integer> range) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value =  super.ask(question, range);
                invalid = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Incorrect input data. Please enter correct data again.");
            } catch (MenuOutException moe) {
                System.out.println("Out of menu range. Please enter correct data again.");
            }
        } while (invalid);
        return value;
    }
}