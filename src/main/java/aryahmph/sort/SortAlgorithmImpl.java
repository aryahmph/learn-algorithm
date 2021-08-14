package aryahmph.sort;

public class SortAlgorithmImpl implements SortAlgorithm {
    /**
     * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements
     * if they are in wrong order.
     * <p>
     * isSorted bool variable is to identify data was sorted or not.
     * <p>
     * Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.
     * Best Case Time Complexity: O(n). Best case occurs when array is already sorted.
     * Auxiliary Space: O(1)
     * Boundary Cases: Bubble sort takes minimum time (Order of n) when elements are already sorted.
     *
     * @param data
     */
    @Override
    public void bubbleSortAsc(int[] data) {
        boolean isSorted;
        int len = data.length;
        for (int i = 0; i < len; i++) {
            isSorted = true;
            for (int j = 1; j < len - i; j++) {
                if (data[j] < data[j - 1]) {
                    swap(data, j, j - 1);
                    isSorted = false;
                }
            }
            if (isSorted) return;
        }
    }

    /**
     * The selection sort algorithm sorts an array by repeatedly finding the minimum element
     * (considering ascending order) from unsorted part and putting it at the beginning.
     * <p>
     * Time Complexity: O(n2) as there are two nested loops.
     * Auxiliary Space: O(1)
     *
     * @param data
     */

    @Override
    public void selectionSortAsc(int[] data) {
        var len = data.length;
        int minIdx;
        for (int i = 0; i < len - 1; i++) {
            minIdx = i;
            for (int j = i + 1; j < len; j++) {
                if (data[j] < data[minIdx]) {
                    minIdx = j;
                }
            }
            swap(data, i, minIdx);
        }
    }

    /**
     * Swap between two item value in array.
     * Just need pass the array index not value in index1, and index2.
     *
     * @param data
     * @param index1
     * @param index2
     */
    public static void swap(int[] data, int index1, int index2) {
        int temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }
}
