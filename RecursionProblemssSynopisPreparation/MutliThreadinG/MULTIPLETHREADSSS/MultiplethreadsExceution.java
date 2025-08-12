package RecursionProblemssSynopisPreparation.MutliThreadinG.MULTIPLETHREADSSS;

class MultiplethreadsExceution extends Thread {
    private String threadName;

    public MultiplethreadsExceution(String name) {
        this.threadName = name;
    }
    public int ans=0;

    public synchronized void run()
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println(threadName + " - Count: " + i);
            ans=ans+1;
            try {
                Thread.sleep(5000); // Sleep to simulate time delay
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }
        System.out.println(threadName + " finished.");
        System.out.println(ans);
    }
}


