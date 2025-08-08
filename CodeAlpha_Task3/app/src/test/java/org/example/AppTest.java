package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    App calculator = new App();

    @Test
    public void testAdd() {
        assertEquals(5.0, calculator.add(2, 3));
        assertEquals(-1.0, calculator.add(-2, 1));
    }

    @Test
    public void testSub() {
        assertEquals(1.0, calculator.sub(3, 2));
        assertEquals(-3.0, calculator.sub(-2, 1));
    }

    @Test
    public void testMul() {
        assertEquals(6.0, calculator.mul(2, 3));
        assertEquals(-2.0, calculator.mul(-2, 1));
    }

    @Test
    public void testDiv() {
        assertEquals(2.0, calculator.div(6, 3));
        assertThrows(IllegalArgumentException.class, () -> calculator.div(1, 0));
    }
}
