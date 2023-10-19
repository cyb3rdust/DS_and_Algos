import java.util.LinkedList;
import java.util.ArrayList;


public class ArrayList_VS_LinkedList {
    public static void main(String[] args) {
        // we are going to explore the diff between linkedlists and arraylists
        // linkedlist VS dynamic array


//////////////////////preparing both data structures for the tests
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime ;
        long endTIme;
        long elapsedTime;
        
        for (int i=0;i<1000000;i++){
            linkedList.add(i);
            arrayList.add(i);
        }

/////////////////////////////////////////////////////////////////////////////////////

        // start time
        startTime = System.nanoTime();



        // do something 
        linkedList.get(999999);
        linkedList.remove(0);
        //end time
        endTIme = System.nanoTime();

        elapsedTime = endTIme-startTime;
        System.out.println("elapsed time LinkedList  "+elapsedTime+ " nano seconds");

////////////////////////////////////////////////////////////////////////////////////
        // start time
        startTime = System.nanoTime();



        // do something 
        arrayList.get(999999);
        arrayList.remove(0);


        //end time
        endTIme = System.nanoTime();

        elapsedTime = endTIme-startTime;
        System.out.println("elapsed time ArrayList  "+elapsedTime + " nano seconds");
    }
}
