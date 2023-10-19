
import java.util.LinkedList;
import java.util.Queue;

public class QUEUE {
   public static void main(String[] args) {
    
    //the queue is a FIFO data structure first in first out 
    // add = enqueue , offer()
    // remove = dequeue , poll() 

    // the Queue in java is an interface and not a class so we cannot make an instance from it 
    // we are going to use another class that implements by default a Queue 
    // a LinkedList
    Queue<String> queue = new LinkedList<String>();
        queue.offer("first");
        queue.offer("second");
        queue.offer("third");
        queue.offer("fourth");

        //take a look at the first element
        System.out.println(queue.peek());
        //serve / remove the first element 
        System.out.println(queue.poll());


        System.out.println(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("second"));

        // // where are queues useful
        // 1-keyboard buffer ( letters should appear in the exact order they are typed )
        // 2-printer queue (documents shall be printed in order)
        // 3-used in LinkedList , priorityQueues ,Breath-first search
    } 
}
