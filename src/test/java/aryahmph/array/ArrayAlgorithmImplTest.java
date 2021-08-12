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

        int[] array2 = {1, 2};
        max = arrayAlgorithm.findMax(array2);
        Assertions.assertEquals(2, max);
    }

    @Test
    void TestFindMaxEmptyArray() {
        int[] array = {};
        Assertions.assertThrows(IllegalArgumentException.class, () -> arrayAlgorithm.findMax(array));
    }

    @Test
    void TestFindMin() {
        int[] array = {1, 24, 2, 2, 124, 123, 1, 2, -1, 42, 1, 120};
        int max = arrayAlgorithm.findMin(array);
        Assertions.assertEquals(-1, max);

        int[] array2 = {0, 12, 2};
        max = arrayAlgorithm.findMin(array2);
        Assertions.assertEquals(0, max);
    }

    @Test
    void TestFindMinEmptyArray() {
        int[] array = {};
        Assertions.assertThrows(IllegalArgumentException.class, () -> arrayAlgorithm.findMin(array));
    }

    @Test
    void TestSum() {
        int total = arrayAlgorithm.sum(1, 2, 3, 4, 5);
        Assertions.assertEquals(15, total);

        total = arrayAlgorithm.sum();
        Assertions.assertEquals(0, total);
    }

    @Test
    void TestAvgEmptyValues() {
        int[] array = {};
        Assertions.assertThrows(ArithmeticException.class, () -> arrayAlgorithm.avg());
    }

}
