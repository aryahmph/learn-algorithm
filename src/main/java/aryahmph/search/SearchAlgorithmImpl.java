package aryahmph.search;

public class SearchAlgorithmImpl implements SearchAlgorithm {
    /**
     * Search algorithm without requiring sorted data.
     * <p>
     * Time Complexity, O(n)
     *
     * @param data
     * @param target
     * @return the index where it found
     */
    @Override
    public int linearSearch(int[] data, int target) {
        int len = data.length;
        for (int i = 0; i < len; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * A search algorithm that requires sorted data.
     * This algorithm has 2 pointers namely middle, left and right so that it seems to divide the array in two.
     * <p>
     * First find the middle index of the array, then compare it with the target, if the target value is greater then it shifts the left pointer, and vice versa.
     * <p>
     * Time Complexity, T(n) = T(n/2) + c
     * Auxiliary Space: O(1)
     *
     * @param data
     * @param target
     * @return the index where it found
     */
    @Override
    public int binarySearch(int[] data, int target) {
        int left = 0;
        int right = data.length - 1;
        int mid = 0;

        while (left <= right) {
            mid = (left + right) >>> 1;
            if (data[mid] == target) {
                return mid;
            } else if (target > data[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
