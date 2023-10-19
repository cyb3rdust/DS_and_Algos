public class QuickSort {
    public static void main(String[] args) {
        int[] array = {5, 4, 22, 3, 9, 7, 5, 0, 1};

        quicksort(array, 0, array.length - 1);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\n");
        }
    }

    private static void quicksort(int[] array, int start, int end) {
        if (end <= start) return; // base case
        int pivot = partition(array, start, end);
        quicksort(array, start, pivot - 1);
        quicksort(array, pivot + 1, end);
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;
        for (int j = start; j <= end - 1; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }
        i++;
        swap(array, i, end);
        return i;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
