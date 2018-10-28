package ru.job4j.converter;
/**
 * Converter
 *
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com)
 */
public class Converter {

    /**
     * Convert rubles to euro.
     * @param value Rubles.
     * @return Euro.
     */
    public int rubleToEuro(int value) {
        return (value / 70);
    }

    /**
     * Convert rubles to dollars.
     * @param value Rubles.
     * @return Dollars.
     */
    public int rubleToDollar(int value) {
        return (value / 60);
    }

    /**
     * Convert euro to rubles.
     * @param value Euro.
     * @return Rubles.
     */
    public int euroToRuble(int value) {
        return (value * 70);
    }

    /**
     * Convert dollars to rubles.
     * @param value Dollars.
     * @return Rubles.
     */
    public int dollarToRuble(int value) {
        return (value * 60);
    }
}
