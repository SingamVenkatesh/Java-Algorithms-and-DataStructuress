package RecursionLearning.STACKSandQUEESS;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomCircularQueue Cqueue=new CustomCircularQueue(5);
        Cqueue.insert(3);
        Cqueue.insert(6);
        Cqueue.insert(5);

        Cqueue.display();
       Cqueue.remove();
       Cqueue.display();

       Cqueue.insert(45);
       Cqueue.display();
        Cqueue.insert(66);
      // Cqueue.display();
      // Cqueue.remove();



        CustomQueue queue= new CustomQueue();
        queue.insert(12);
        queue.insert(19);
        queue.insert(8);
        queue.insert(92);
        queue.insert(52);
        queue.insert(22);
        // queue.display();
        queue.remove();
        // queue.display();



    }
}
