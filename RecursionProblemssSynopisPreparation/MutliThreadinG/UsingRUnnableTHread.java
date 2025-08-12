package RecursionProblemssSynopisPreparation.MutliThreadinG;

public class UsingRUnnableTHread {
        public static void main(String[] args) {
            Thread t = new Thread(new MyRunnable());
            Thread e = new Thread(new MyRunnable());

                t.start();
                e.start();



        }
    }