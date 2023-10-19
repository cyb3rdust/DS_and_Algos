

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQUEUE {
    public static void main(String[] args) {
        // Queue<Double> queue = new PriorityQueue<Double>();// this will display them as they are
        Queue<Double> queue = new PriorityQueue<Double>(Collections.reverseOrder());// this will display them from smallest to largest

        
        queue.offer(1.2);
        queue.offer(1.1);  
        queue.offer(2.2);  
        queue.offer(4.2);  
        queue.offer(0.2);  

        while(!queue.isEmpty())
        System.out.println(queue.poll());
    }
}
