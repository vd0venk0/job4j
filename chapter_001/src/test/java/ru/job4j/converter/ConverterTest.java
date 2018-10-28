package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Tests for Converter.
 *
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class ConverterTest {

    /**
     * Test for convert rubles to dollars.
     */
    @Test
    public void when60RublesToDollarsThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        assertThat(result, is(1));
    }

    /**
     * Test for convert rubles to euro.
     */
    @Test
    public void when70RublesToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(70);
        assertThat(result, is(1));
    }

    /**
     * Test for convert dollars to rubles.
     */
    @Test
    public void when2DollarsToRublesThen120() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(2);
        assertThat(result, is(120));
    }

    /**
     * Test for convert euro to rubles.
     */
    @Test
    public void when2EuroToRublesThen140() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(2);
        assertThat(result, is(140));
    }
}