package ru.job4j.tracker;

/**
 * Item.
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com)
 * @version $Id$
 * @since 0.1.
 */
public class Item {

    private String id;
    public String name;
    public String description;
    public long create;

    public Item() {

    }

    public Item(String name, String description, long create) {
        this.name = name;
        this.description = description;
        this.create = create;
    }

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public void printItem() {
        System.out.println("---------------------------");
        System.out.println("Имя заявки: " + this.name);
        System.out.println("Описание:   " + this.description);
        System.out.println("ID заявки:  " + this.id);
        System.out.println("---------------------------");
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }
}