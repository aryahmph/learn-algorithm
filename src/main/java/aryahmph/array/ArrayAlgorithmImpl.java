package aryahmph.array;

public class ArrayAlgorithmImpl implements ArrayAlgorithm {
    /**
     * Search maximum value in array
     * Best Case : O(1)
     * Worst Case : O(n)
     *
     * @param array
     * @return maximum value in array || IllegalArgumentException
     */
    @Override
    public int findMax(int[] array) {
        int len = array.length;
        if (len < 1) throw new IllegalArgumentException("array is empty");

        int maxIdx = array[0];
        for (int i = 1; i < len; i++) {
            if (array[i] > array[maxIdx]) maxIdx = i;
        }
        return array[maxIdx];
    }

    /**
     * Search minimum value in array
     * Best Case : O(1)
     * Worst Case : O(n)
     *
     * @param array
     * @return minimum value in array || IllegalArgumentException
     */
    @Override
    public int findMin(int[] array) {
        int len = array.length;
        if (len < 1) throw new IllegalArgumentException("array is empty");

        int minIdx = array[0];
        for (int i = 1; i < len; i++) {
            if (array[i] < array[minIdx]) minIdx = i;
        }
        return array[minIdx];
    }

    /**
     * Sum all number
     *
     * @param values
     * @return total number
     */
    @Override
    public int sum(int... values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }

    /**
     * Average all number
     *
     * @param values
     * @return average number
     */
    @Override
    public double avg(int... values) {
        if (values.length < 1) throw new ArithmeticException("divided by zero");
        double total = 0;
        for (int value : values) {
            total += value;
        }
        return total / values.length;
    }
}
