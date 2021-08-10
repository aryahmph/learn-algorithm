package aryahmph.sort;

public class SortAlgorithmImpl implements SortAlgorithm {
    /**
     * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
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
     * Swap between two item value in array.
     *
     * @param data
     * @param index1
     * @param index2
     */
    private void swap(int[] data, int index1, int index2) {
        int temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }
}
