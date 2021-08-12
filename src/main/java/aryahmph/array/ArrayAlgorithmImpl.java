package aryahmph.array;

public class ArrayAlgorithmImpl implements ArrayAlgorithm {
    /**
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

    @Override
    public int sum(int... values) {
        return 0;
    }

    @Override
    public double avg(int... values) {
        return 0;
    }
}
