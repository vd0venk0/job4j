package ru.job4j.tracker;

import java.util.List;

/**
 * ValidateInput.
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com)
 * @version $Id$
 * @since 0.1.
 */
public class ValidateInput implements Input {

    private final Input input;

    public ValidateInput(final Input input) {
        this.input = input;
    }

    @Override
    public String ask(String question) {
        return this.input.ask(question);
    }

    public String ask(String question, List<Integer> range) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value =  Integer.valueOf(this.input.ask(question, range));
                invalid = false;
            } catch (MenuOutException moe) {
                System.out.println("Out of menu range. Please enter correct data again.");
            } catch (NumberFormatException nfe) {
                System.out.println("Incorrect input data. Please enter correct data again.");
            }
        } while (invalid);
        return Integer.toString(value);
    }
}