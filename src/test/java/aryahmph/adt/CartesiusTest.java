package aryahmph.adt;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CartesiusTest {
    private Cartesius cartesius;

    @Test
    void TestCartesius() {
        cartesius = new Cartesius(2, 5);
        cartesius.displayCoordinate();

        String quadrant = cartesius.getQuadrant();
        Assertions.assertEquals("Quadrant I", quadrant);
    }
}
