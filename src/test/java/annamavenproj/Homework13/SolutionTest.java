package annamavenproj.Homework13;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void testNumJewelsInStones() {
        Solution solution = new Solution();
        assertEquals(3, solution.numJewelsInStones("aA", "aAAbbbb"));
        assertEquals(0, solution.numJewelsInStones("z", "ZZ"));
        assertEquals(1, solution.numJewelsInStones("a", "b"));
    }
}

