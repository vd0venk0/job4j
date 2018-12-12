package ru.job4j.profession;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class HouseTest {
    /**
     * Test for House.
     */
    @Test
    public void whenHouseProgressIs95() {
        int houseProgress = 95;
        Profession engineer = new Engineer();
        House house = new House(houseProgress);
        int result = ((Engineer) engineer).build(house);
        int expect = 95;
        assertThat(result, is(expect));
    }
}
