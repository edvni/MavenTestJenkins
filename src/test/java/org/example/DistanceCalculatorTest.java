package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class DistanceCalculatorTest {

    @Test
    public void testCalculateDistance() {
        double x1 = 3;
        double y1 = 4;
        double x2 = 7;
        double y2 = 1;

        double distance = DistanceCalculator.calculateDistance(x1, y1, x2, y2);

        assertEquals(distance, 5, 0.001);
    }
}
