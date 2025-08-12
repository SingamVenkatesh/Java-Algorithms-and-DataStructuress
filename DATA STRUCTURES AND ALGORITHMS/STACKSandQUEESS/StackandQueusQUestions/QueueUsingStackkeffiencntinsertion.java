package RecursionLearning.STACKSandQUEESS.StackandQueusQUestions;

import java.util.Queue;
import java.util.Stack;
// leetcode problem number : 232
public class QueueUsingStackkeffiencntinsertion
{
    // this is add efficient
    private Stack<Integer> first;
    private Stack<Integer> second;
    public QueueUsingStackkeffiencntinsertion()
    {
        first=new Stack<>();
        second=new Stack<>();
    }

    public void add(int item)

    {
        first.push(item);
    }

    public int remove() { // adding all the elements from the first stack to second stacks
        // so that elements will be reversed. now when we pop the element from the second stack
        // the last element will be removed so that last element is first element in first stack
        // then add all the elements back to the first stack.
        //int removed = first.pop();

        while (!first.isEmpty()) {
           // removed = first.pop();
            second.push(first.pop());
        }
       int removed= second.pop();
        while(!second.isEmpty())
        {
            first.push(second.pop());
        }
        return removed;

    }


    public boolean isEmpty()
    {
        return first.isEmpty();
    }

    public int peek()
    {

        while (!first.isEmpty()) {
            // removed = first.pop();
            second.push(first.pop());
        }
         int peeked= second.peek();// ante second stack lo last lo unna element ni print
        // chestham enduku ante second stack lo last lo unna element first stack
        // lo frist element kabatii...peek in queue is first element and
        // in stack is last element.
        while(!second.isEmpty())
        {
            first.push(second.pop());
        }
        return peeked;

    }

        public static void main(String[] args)
        {
            QueueUsingStackkeffiencntinsertion myQueue = new QueueUsingStackkeffiencntinsertion();
            myQueue.add(1);
            myQueue.add(2);
            System.out.println(myQueue.peek()); // Output: 1
            System.out.println(myQueue.remove());  // Output: 1
            System.out.println(myQueue.isEmpty());// Output: false
        }


}
