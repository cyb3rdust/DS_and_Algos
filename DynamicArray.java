public class DynamicArray {
   int size;
   int capacity = 10;
   Object [] array;

   public DynamicArray(){
    this.array = new Object[capacity]; 
   }

   public DynamicArray(int capacity){
    this.capacity = capacity;
    this.array = new Object[capacity];
   }
   
   public void add(Object data){
      if(size>=capacity){
         grow();
      }
      array[size]= data;
      size++; 
   }


   public void insert(int index, Object data){
      if(size>=capacity){
         grow();
      }
      for(int i=this.size;i>index;i--){
         array[i] = array[i-1]; 
      }
      array[index] = data;
      size++;
   }


   public void delete(Object data){
      for (int i=0;i<size;i++){
         if(array[i]==data){
            for(int j=0;j<(size-i-1);j++){
               array[i+j] = array[i+j+1];
            }
            array[size-1] = null;
            size--;
            if(size<=(int)(capacity/3)){
               shrink();
            }
            break;
         }
      }
   }


   public int search(Object data){
      for (int i = 0;i<size;i++){
         if(array[i]==data) return i;
      }
      return -1;
   }


   private void grow(){
      int newCapacity = (int)(capacity*2);
      Object [] newArray  = new Object[newCapacity];
      for (int i = 0 ;i<size;i++){
         newArray[i]=array[i];
      }
      capacity = newCapacity;
      array = newArray;
   }


   private void shrink(){
     int newCapacity = (int)(capacity / 2);
      Object [] newArray  = new Object[newCapacity];
      for (int i = 0 ;i<size;i++){
         newArray[i]=array[i];
      }
      capacity = newCapacity;
      array = newArray;
   }


   public boolean isEmpty(){
      if(size==0) return true ;
      else return false;
   }


   // Using String builder for efficiency
   public String toString() {
      StringBuilder stringBuilder = new StringBuilder("[ ");
      for (int i = 0; i < size; i++) {
          if (i == size - 1) {
              stringBuilder.append(array[i]);
          } else {
              stringBuilder.append(array[i]).append(" - ");
          }
      }
      stringBuilder.append(" ]");
      return stringBuilder.toString();
  }
  
}
