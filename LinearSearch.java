public class LinearSearch {
    

    // linear search : searches the dataset by looping overy it item by item untill it finds a match
    // time complexity O(n)
    public static void main(String[] args) {
        int[] array = {4,1,2,3,9,7,22,3,1,4,5,6,4};
        int index = linearSearch(array,1);
        System.out.println(index);
        
    }

    private static int linearSearch(int[] value,int index) {
        for(int i=0;i<value.length;i++){
            if(value[i]==index) return i;
        }
        return -1;
    }
}
