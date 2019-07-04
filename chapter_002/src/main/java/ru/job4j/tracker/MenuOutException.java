package ru.job4j.tracker;

/**
 * MenuOutException.
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com)
 * @version $Id$
 * @since 0.1.
 */
public class MenuOutException extends RuntimeException {

    public MenuOutException (String msg) {
        super(msg);
    }
}
