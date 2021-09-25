package edu.gl.dddsampleduck.domain.model.duck;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class DuckTest {

    @Test
    public void testEquality() {
        Duck duck1 = new Duck();
        duck1.setName("Duck1");
        Duck duck2 = new Duck();
        duck2.setName("Duck2");

        assertThat(duck1.equals(duck2)).as("Ducks should be of different instances").isFalse();
    }
}
