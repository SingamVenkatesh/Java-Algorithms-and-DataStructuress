package RecursionLearning.STACKSandQUEESS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackMethodsOperation {
    public static void main(String[] args) {

        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
      //  System.out.println(stack);
    //    System.out.println(stack.isEmpty()); // false
      //  stack.clear();// this will clear the total stack
        //System.out.println(stack.contains(7));
      //  System.out.println(stack.pop()); removes the element form the stack i mean top element
    //    System.out.println(stack.peek());
       // System.out.println(stack);




        // all the possible queue methods in java
        Queue<Integer> queue=new LinkedList<>();

        Queue<Integer> queue1=new LinkedList<>();
        queue.offer(1);// this will add and shows exception return false if full
        queue.add(2);// this will add but not shows exception
        queue.offer(3);
        queue.offer(4);

        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.poll());// poll also removes and returns shows null if queue is empty
        System.out.println(queue);
        System.out.println(queue1.poll());

    }
}
