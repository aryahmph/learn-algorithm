package aryahmph.search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class SearchAlgorithmImplTest {
    private SearchAlgorithm searchAlgorithm;

    @BeforeEach
    void setUp() {
        searchAlgorithm = new SearchAlgorithmImpl();
    }

    @Test
    void TestLinearSearch() {
        int[] data = {1, 2, 5, 7, 2, 4, 1};
        int index = searchAlgorithm.linearSearch(data, 4);
        Assertions.assertEquals(5, index);
    }

    @Test
    void TestBinarySearch() {
        int[] data = {1, 2, 3, 4, 5, 6, 7};
        int index = searchAlgorithm.binarySearch(data, 5);
        Assertions.assertEquals(4, index);
    }
}
