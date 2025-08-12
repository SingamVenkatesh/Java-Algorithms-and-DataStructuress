package STACKqUESTIONS;

import java.util.*;

public class Queueuemethods {
    public static void main(String[] args)
    {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1);
        System.out.println(dq);
        dq.addFirst(3);
        System.out.println(dq);
        dq.addLast(10);
        System.out.println(dq);
        System.out.println("First element" + dq.peekFirst());
        System.out.println("last element" + dq.peekLast());



        Iterator<Integer> it = dq.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

         Iterator<Integer> ti=dq.iterator();

        while (ti.hasNext())
        {
            System.out.println(ti.next());
        }

    }
}
