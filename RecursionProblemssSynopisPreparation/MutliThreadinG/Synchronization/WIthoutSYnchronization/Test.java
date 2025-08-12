package RecursionProblemssSynopisPreparation.MutliThreadinG.Synchronization.WIthoutSYnchronization;

public class Test {
    public static void main(String[] args) {
        Table obj = new Table();
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();
    }
}