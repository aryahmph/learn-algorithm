package aryahmph.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SearchAlgorithmImplTest {
    private SortAlgorithm sortAlgorithm;

    @BeforeEach
    void setUp() {
        sortAlgorithm = new SortAlgorithmImpl();
    }

    @Test
    void TestBubbleSort() {
        int[] data = {2, 4, 1, 2, 5};
        sortAlgorithm.bubbleSortAsc(data);
        Assertions.assertArrayEquals(new int[]{1, 2, 2, 4, 5}, data);

        int[] data2 = {6, 4};
        sortAlgorithm.bubbleSortAsc(data2);
        Assertions.assertArrayEquals(new int[]{4, 6}, data2);

        int[] data3 = {6};
        sortAlgorithm.bubbleSortAsc(data3);
        Assertions.assertArrayEquals(new int[]{6}, data3);

        int[] data4 = {};
        sortAlgorithm.bubbleSortAsc(data4);
        Assertions.assertArrayEquals(new int[]{}, data4);
    }
}
