package Thread;

public class RunnableCounter implements Runnable {
    static final int DEFALULT_MAX_COUNT = 10;
    static final int DEFAULT_INTERVAL = 1000;
    static int totalCount = 0;
    static Count totalCount = new Count();
    String name;
    int maxCount = DEFALULT_MAX_COUNT;
    int interval = DEFAULT_INTERVAL;
    int count;
    boolean running = false;
    Thread thread;

    public RunnableCounter(String name, int maxCount) {
        this.name = name;
        this.maxCount = maxCount;
        count = 0;
    }

    public void stop() {
        running = false;
        thread.interrupt();
    }

    public void getCount(){};

    public boolean isRunning() {
        return running;
    }

    @Override
    public synchronized void run() {
        running = true;
        thread = Thread.currentThread();

        while (running && count < maxCount) {
            ++count;
            ++totalCount;
            // try {
            // Thread.sleep(interval); //어쨌든 기다려야 하기 때문에 문제가 발생한다.
            // 동작에 문제는 없지만 즉시 뭔가를 제어(스탑)할 순 없다는 문제 발생..
            // System.out.printf("%s : %d%n", name, ++count);
            // } catch (InterruptedException e) {
            // running = false;
            // Thread.currentThread().interrupt();
            // }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        RunnableCounter counter1 = new RunnableCounter("counter1", 1000000);
        RunnableCounter counter2 = new RunnableCounter("counter2", 1000000);

        Thread thread1 = new Thread(counter1, "Counter1");
        Thread thread2 = new Thread(counter2, "Counter2");

        thread1.start();
        thread2.start();
        // Thread.sleep(5000);

        // thread1.interrupt();

        // Thread.sleep(10000);
        thread1.join();
        thread2.join();
        System.out.println("Counter1 : " + counter1.getCount());
        System.out.println("Counter1 2 " + counter1.getCount());
        System.out.println("Totla Count:  : " + RunnableCounter.totalCount.getCount());
    }
}
// sleep을 쓸 땐 try, catch를 사용하는 이유?
// interrupt -> sleep, wait를 깨움
