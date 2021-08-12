package aryahmph.array;

public class ArrayAlgorithmImpl implements ArrayAlgorithm {
    /**
     * @param array
     * @return max value in array || IllegalArgumentException
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

    @Override
    public int findMin(int[] array) {
        return 0;
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
