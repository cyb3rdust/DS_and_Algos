public class InsertionSort {


   public static void main(String[] args) {
         int array [] = {6,5,4,7,22,1,3,9,477,1};
        Insertionsort(array);
        for (int i : array) {
            System.out.println(i);
        } 
   }
        
    private static void Insertionsort(int []array){
        for (int i=0;i<array.length;i++){
            int temp = array[i];
            int j = i-1;
            while(j>=0 && array[j]>temp){
                array[j+1] = array[j];
                j--;
            }
            
            array[j+1] = temp;
            }
        }
}