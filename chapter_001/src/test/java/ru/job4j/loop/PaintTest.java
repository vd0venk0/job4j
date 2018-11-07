package ru.job4j.loop;

import org.junit.Test;
import java.util.StringJoiner;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Tests for Paint.
 *
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class PaintTest {

    /**
     * Test for pyramid with height = 3.
     */
    @Test
    public void whenHeight3ThenPyramid5() {
        Paint paint = new Paint();
        String rst = paint.pyramid(3);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("  ^  ")
                                .add(" ^^^ ")
                                .add("^^^^^")
                                .toString()
                )
        );
    }

    /**
     * Test for pyramid with height = 4.
     */
    @Test
    public void whenHeight4ThenPyramid7() {
        Paint paint = new Paint();
        String rst = paint.pyramid(4);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("   ^   ")
                                .add("  ^^^  ")
                                .add(" ^^^^^ ")
                                .add("^^^^^^^")
                                .toString()
                )
        );
    }
}
