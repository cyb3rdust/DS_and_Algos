public class MergeSort {
    public static void main(String[] args) {
        int[] array = {5, 4, 22, 3, 9, 7, 5, 0, 1};

        mergeSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\n");
        }
    }

    private static void mergeSort(int[] array) {
        int length = array.length;
        if (length <= 1) return; // Base case
        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        // Populate left and right subarrays
        for (int i = 0; i < middle; i++) {
            leftArray[i] = array[i];
        }
        for (int i = middle; i < length; i++) {
            rightArray[i - middle] = array[i];
        }

        mergeSort(leftArray);  // Recursively sort the left subarray
        mergeSort(rightArray); // Recursively sort the right subarray
        merge(leftArray, rightArray, array); // Merge the sorted subarrays back into the original array
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftLength = leftArray.length;
        int rightLength = rightArray.length;
        int i = 0, l = 0, r = 0; // Indices

        // Merge the two subarrays
        while (l < leftLength && r < rightLength) {
            if (leftArray[l] <= rightArray[r]) {
                array[i++] = leftArray[l++];
            } else {
                array[i++] = rightArray[r++];
            }
        }

        // Copy any remaining elements from the left and right subarrays
        while (l < leftLength) {
            array[i++] = leftArray[l++];
        }
        while (r < rightLength) {
            array[i++] = rightArray[r++];
        }
    }
}
