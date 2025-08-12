package RecursionLearning;

public class MUTLITHREADING extends Thread{


    public void run()
    {
        System.out.println("thred is running " + Thread.currentThread());

    }


    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());// give the current thread running name
      //  System.out.println(Thread.activeCount());

        MUTLITHREADING t1=new MUTLITHREADING();
        t1.start();
       // MUTLITHREADING t2=new MUTLITHREADING();
      //  t2.start();
      //  MUTLITHREADING t3=new MUTLITHREADING();
      //  t3.start();





    }
}
