public class BinarySearch {
    
    
    public static void main(String[] args) {
        // Binary search : search that finds an element within a sorted arrray 
        // harf of the array is eleminated from the search in each iterration 

        // binary search complexity is : O(log n)
        // binary search is fantastic when working with a huge dataset

        int array[] = new int[10000000];
        for(int i=0;i<array.length;i++){
            array[i]=i;
        }
        int wanted = binarySearch(array, 800000);
        System.out.println(wanted);
        
    }
    private static int binarySearch(int array[],int target){
       int low = 0;
       int high = array.length;
       while(low<=high){
        int middle = (low)+ ((high-low)/2);
        int value = array[middle];
        if(value > target) {
            high = middle-1;
        }
        else if(value<target){
            low = middle+1;
        }   
        else if(value==target){
            return middle;
        }

       }     
       return -1;
    }
}
