import java.util.LinkedList;

public class LinkedLIST {
    public static void main(String[] args) {
       LinkedList<String> linkedList = new LinkedList<String>();
    
    //when we use push we treat our linked list as a Queue
    //    linkedList.push("a");
    //    linkedList.push("b");
    //    linkedList.push("c");
    //    linkedList.push("d");
    //    linkedList.push("f");
    //    linkedList.pop()



    //when we use offer we treat our linked list as a stack rather than a queue
       linkedList.offer("a");
       linkedList.offer("b");
       linkedList.offer("c");
       linkedList.offer("d");
       linkedList.offer("f"); 
    //    linkedList.poll();

       linkedList.add(4, "e");
    //    linkedList.remove("e");
    System.out.println(linkedList.peekFirst());
    System.out.println(linkedList.peekLast());
    linkedList.addFirst("o");
    linkedList.addLast("g");
    System.out.println(linkedList); 

    String first = linkedList.removeFirst();
    String last = linkedList.removeLast();
    System.out.println(first + "," + last);
   }
}
