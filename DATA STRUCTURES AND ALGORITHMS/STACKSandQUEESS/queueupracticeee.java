package RecursionLearning.STACKSandQUEESS;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class queueupracticeee {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<Integer>();
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);
        q.add(16);

        System.out.println(q.remove());
        System.out.println(q);
        System.out.println(q.peek());

        Deque<Integer> deque=new ArrayDeque<>();

        deque.addFirst(12);
        deque.addFirst(13);
        deque.addLast(90);
        System.out.println("THis is dque " + deque);


    }
}
