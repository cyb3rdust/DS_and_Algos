
import java.util.Stack;


public class STACK{

public static void  main(String [] args) {
    // Stack is a LIFO data structure  (last in / first out)
    Stack<String> stack = new Stack<String>();
    System.out.println(stack.empty());
    //pushing objects to the stack
    stack.push("minecraft");
    stack.push("csgo");
    stack.push("warzone");
    //popping items from the stack
    Object popped = stack.pop();
    System.out.println(popped);
    //find index of an object within the stack
    int index = stack.search("csgo");
    System.out.println(index);
    System.out.println(stack.search(popped));//for this one it will be -1 because its popped and it doesn't exist in the stack anymore
    // a stack can be out of memory because of java heap space
    for (int i=0;i<100;i++)
    {
        stack.push("csgo");
        //if we replace a 100 with 1000000 or a big number you will get the out of memory error 
    }
    //uses of stacks
    // 1-undo/redo features in text editors
    // 2-moving back/forward in browser history
    // 3-backtracking algorithmes (maze,file directory)
    // 4-calling functions (call stack)
}
}