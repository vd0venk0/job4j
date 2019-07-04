package ru.job4j.tracker;

import java.util.List;

/**
 * Input.
 * Интерфейс для ввода данных.
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com)
 * @version $Id$
 * @since 0.1.
 */
public interface Input {
    String ask(String question);

    int ask (String question, List<Integer> range);
}