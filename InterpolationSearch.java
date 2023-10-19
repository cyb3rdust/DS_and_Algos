public class InterpolationSearch {
    public static void main(String[] args) {
        int array[] = {2, 3, 4, 4, 5, 6, 6, 8};
        int wanted = interpolationSearch(array, 8);
        System.out.println(wanted); // Output: 7 (index where 8 is found)
    }

    /*
     * Interpolation search is a searching algorithm used to find a specific element within a sorted array by estimating its probable position 
     * based on the values of nearby elements, optimizing the search process for ordered datasets.
     * In interpolation search, the estimation of the target element's position is made by considering 
     * the distribution of values in the dataset, which allows for faster convergence towards the desired element compared to linear search algorithms.
     */

    public static int interpolationSearch(int[] array, int value) {
        int high = array.length - 1;
        int low = 0;

        while (value >= array[low] && value <= array[high] && low <= high) {
            int probability = low + (high - low) * (value - array[low]) / (array[high] - array[low]);

            System.out.println("probability: " + probability);

            if (array[probability] == value) {
                return probability;
            } else if (array[probability] < value) {
                low = probability + 1;
            } else {
                high = probability - 1;
            }
        }

        return -1;
    }
}
