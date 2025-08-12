package RecursionProblemssSynopisPreparation.MutliThreadinG.MULTIPLETHREADSSS;


public class MainMethod {
    public static void main(String[] args) {
        MultiplethreadsExceution t1 = new MultiplethreadsExceution("Thread-A");
        MultiplethreadsExceution t2 = new MultiplethreadsExceution("Thread-B");
        MultiplethreadsExceution t3 = new MultiplethreadsExceution("Thread-C");

        // Start all threads
        t1.start();
        t1.setPriority(10);
        t2.start();
        t3.start();


        System.out.println("Main thread ends.");
    }
}