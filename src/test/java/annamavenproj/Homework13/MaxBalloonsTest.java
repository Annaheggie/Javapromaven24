package annamavenproj.Homework13;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxBalloonsTest {

    @Test
    public void testMaxNumberOfBalloons() {
        MaxBalloons maxBalloons = new MaxBalloons();
        assertEquals(1, maxBalloons.maxNumberOfBalloons("balloon"));
        assertEquals(2, maxBalloons.maxNumberOfBalloons("balloonballoon"));
        assertEquals(0, maxBalloons.maxNumberOfBalloons("balloons"));
        assertEquals(0, maxBalloons.maxNumberOfBalloons("balloonsballoons"));
        assertEquals(3, maxBalloons.maxNumberOfBalloons("balloonballoonballoon"));
    }
}
