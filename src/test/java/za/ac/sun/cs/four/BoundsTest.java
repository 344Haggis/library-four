package za.ac.sun.cs.four;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BoundsTest {

    @Test
    void limitsToRange() {
        assertEquals(100.0, Bounds.limit(150.0));
        assertEquals(0.0, Bounds.limit(-5.0));
        assertEquals(42.0, Bounds.limit(42.0));
    }
}
