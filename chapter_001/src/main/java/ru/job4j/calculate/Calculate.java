package ru.job4j.calculate;

/**
* Calculate
* 
* @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com)
*/
public class Calculate {

    /**
    * Тройное эхо.
    * @param args - args.
    */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
        
    /**
    * Метод откликается тройным эхом на входящее имя.
    * @param name Your name.
    * @return Echo plus your name.
    */
    public String echo(String name) {
        return "Echo, echo, echo : " + name;
    }

}