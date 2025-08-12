package RecursionProblemssSynopisPreparation.MutliThreadinG.Synchronization.WIthoutSYnchronization;

public class Table {

    void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + (n * i));
            try { Thread.sleep(400); } catch (Exception e) {}
        }
    }
}

class MyThread1 extends Thread {
    Table t;
    MyThread1(Table t) { this.t = t; }
    public void run() {
        t.printTable(5);
    }
}

class MyThread2 extends Thread {
    Table t;
    MyThread2(Table t) { this.t = t; }
    public void run() {
        t.printTable(100);
    }
}


