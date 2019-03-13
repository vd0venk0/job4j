package ru.job4j.pseudo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class PaintTest {
    // получаем ссылку на стандартный вывод в консоль.
    private final PrintStream stdout = System.out;
    // Создаем буфер для хранения вывода.
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before //метод, выполняемый до запуска теста.
    public void loadOutput() {
        System.out.println("Execute before method.");
        //Заменяем стандартный вывод на вывод в пямять для тестирования.
        System.setOut(new PrintStream(out));
    }
    @After //метод, выполняемый после запуска теста.
    public void backOutput() {
        // возвращаем обратно стандартный вывод в консоль.
        System.setOut(this.stdout);
        System.out.println("Execute after method.");
    }

    /**
     * Test for Paint - DrawSquare.
     */
    @Test
    public void whenDrawSquare() {
        // выполняем действия пишушие в консоль.
        new Paint().draw(new Square());
        // проверяем результат вычисления
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("*****")
                                .append(System.lineSeparator())
                                .append("*   *")
                                .append(System.lineSeparator())
                                .append("*   *")
                                .append(System.lineSeparator())
                                .append("*   *")
                                .append(System.lineSeparator())
                                .append("*****")
                                .append(System.lineSeparator())
                                .append(System.lineSeparator())
                                .toString()
                )
        );
    }

    /**
     * Test for Paint - DrawTriangle.
     */
    @Test
    public void whenDrawTriangle() {
        new Paint().draw(new Triangle());
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("    *")
                                .append(System.lineSeparator())
                                .append("   **")
                                .append(System.lineSeparator())
                                .append("  * *")
                                .append(System.lineSeparator())
                                .append(" *  *")
                                .append(System.lineSeparator())
                                .append("*****")
                                .append(System.lineSeparator())
                                .append(System.lineSeparator())
                                .toString()
                )
        );
    }
}