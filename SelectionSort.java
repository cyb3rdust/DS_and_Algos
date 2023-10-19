public class SelectionSort {
    public static void main(String[] args) {
        // Selection Sort is only good for small data sets
        int array [] = {6,5,4,7,22,1,3,9,477,1};
        Selectionsort(array);
        for (int i : array) {
            System.out.println(i);
        } 
    }

    private static void Selectionsort(int []array){
        for (int i=0;i<array.length-1;i++){
            int min = i;
            for (int j=i+1;j<array.length;j++){
                if(array[min]>array[j]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i]= array[min];
            array[min]=  temp;
        }
    }
}
