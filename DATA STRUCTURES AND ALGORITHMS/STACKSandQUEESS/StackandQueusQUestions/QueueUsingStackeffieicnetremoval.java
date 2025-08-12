package RecursionLearning.STACKSandQUEESS.StackandQueusQUestions;
import java.util.Queue;
import java.util.Stack;
// leetcode problem number : 232
public class QueueUsingStackeffieicnetremoval
{
    // this is remove efficient
    /*
    ante indulo manam first stack lo alredy elemtns ni reverse chesi pedham qeueu elements so
    pop() chesthe direct last elemtnt(quueue lo first elemtn remove ayipothundh)
     */
    private Stack<Integer> first;
    private Stack<Integer> second;
    public QueueUsingStackeffieicnetremoval()
    {
        first=new Stack<>();
        second=new Stack<>();
    }

    public void add(int item)
    {
       while (!first.isEmpty())
       {
           second.push(first.pop());
       }

       first.push(item);
       while (!second.isEmpty())
       {
           first.push(second.pop());
       }
    }

    public int remove() {

       int removed =first.pop();
        return removed;

    }


    public boolean isEmpty()
    {
        return first.isEmpty();
    }

    public int peek()
    {
        // enduku ante alredy first stack lo  manam queue ni reverse chesi store chestham kabatti
        // first stack lo unna last element ==queue lo unna first elemtn.

       return first.pop();

    }


}

