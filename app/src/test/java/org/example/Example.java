package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ExampleTest {
    @Test
    void testSum() {
        Example example = new Example();
        assertEquals(5, example.sum(2, 3));
    }
}