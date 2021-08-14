package aryahmph.array;

public class MatrixAlgorithmImpl implements MatrixAlgorithm {

    /**
     * Sum between two matrix
     * The rules is size of matrix must same
     *
     * @param matrix1
     * @param matrix2
     * @return
     */
    @Override
    public int[][] sumTwoMatrix(int[][] matrix1, int[][] matrix2) {
        int row = matrix1.length;
        int col = matrix1[0].length;

        // If matrix length is not same
        if (row != matrix2.length || col != matrix2[0].length)
            throw new IllegalArgumentException("matrix size is not same.");

        int[][] result = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }
}
