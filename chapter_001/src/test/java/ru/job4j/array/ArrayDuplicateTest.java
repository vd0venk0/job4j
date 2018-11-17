package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.*;
/**
 * Tests for ArrayDuplicate.
 *
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class ArrayDuplicateTest {
    /**
     * Test for ArrayDuplicate.
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        String[] input = {"Liza", "Olga", "Liza", "Sveta", "Valeria"};
        String[] exception = {"Liza", "Olga", "Sveta", "Valeria"};
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] result = arrayDuplicate.remove(input);
        assertThat(result, arrayContainingInAnyOrder(exception));
    }
}
