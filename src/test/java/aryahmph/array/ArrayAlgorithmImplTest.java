package aryahmph.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArrayAlgorithmImplTest {
    private ArrayAlgorithm arrayAlgorithm;

    @BeforeEach
    void setUp() {
        arrayAlgorithm = new ArrayAlgorithmImpl();
    }

    @Test
    void TestFindMax() {
        int[] array = {1, 24, 2, 2, 124, 123, 1, 2, 42, 1, 120};
        int max = arrayAlgorithm.findMax(array);
        Assertions.assertEquals(124, max);

        int[] array2 = {1,2};
        max = arrayAlgorithm.findMax(array2);
        Assertions.assertEquals(2, max);
    }

    @Test
    void TestFindMaxEmptyArray() {
        int[] array = {};
        Assertions.assertThrows(IllegalArgumentException.class, () -> arrayAlgorithm.findMax(array));
    }
}
