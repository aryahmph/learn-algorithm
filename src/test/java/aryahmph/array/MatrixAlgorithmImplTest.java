package aryahmph.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MatrixAlgorithmImplTest {
    private MatrixAlgorithm matrixAlgorithm;

    @BeforeEach
    void setUp() {
        matrixAlgorithm = new MatrixAlgorithmImpl();
    }

    @Test
    void TestSumTwoMatrix() {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrix2 = {{7, 8, 9}, {10, 11, 12}};

        int[][] res = matrixAlgorithm.sumTwoMatrix(matrix1, matrix2);
        Assertions.assertArrayEquals(new int[][]{{8, 10, 12}, {14, 16, 18}}, res);
    }

    @Test
    void TestSumTwoMatrixError() {
        int[][] matrix1 = {{1, 2}, {4, 5, 6}};
        int[][] matrix2 = {{7, 8, 9}, {10, 11, 12}};

        Assertions.assertThrows(IllegalArgumentException.class, () -> matrixAlgorithm.sumTwoMatrix(matrix1, matrix2));
    }

    @Test
    void TestTranspose() {
        int[][] matrix = {{2, 1, 3}, {4, 6, 5}};
        int[][] result = matrixAlgorithm.transpose(matrix);
        Assertions.assertArrayEquals(new int[][]{{2, 4}, {1, 6}, {3, 5}}, result);
    }
}
