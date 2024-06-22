package annamavenproj.Homework13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GoodPairsTest {

    @Test
    void testNumIdenticalPairs() {
        GoodPairs goodPairs = new GoodPairs();
        int[] nums = {1, 2, 3, 1, 1, 3};
        assertEquals(4, goodPairs.numIdenticalPairs(nums));
    }

    @Test
    void testNumIdenticalPairsEmptyArray() {
        GoodPairs goodPairs = new GoodPairs();
        int[] nums = {};
        assertEquals(0, goodPairs.numIdenticalPairs(nums));
    }

    @Test
    void testNumIdenticalPairsNoPairs() {
        GoodPairs goodPairs = new GoodPairs();
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(0, goodPairs.numIdenticalPairs(nums));
    }
}
