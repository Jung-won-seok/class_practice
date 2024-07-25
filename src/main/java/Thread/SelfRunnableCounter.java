package Thread;

public class SelfRunnableCounter implements Runnable {
    static final int DEFALULT_MAX_COUNT = 10;
    static final int DEFAULT_INTERVAL = 1000;
    String name;
    int maxCount = DEFALULT_MAX_COUNT;
    int interval = DEFAULT_INTERVAL;
    int count;
    Thread thread;

    public SelfRunnableCounter(String name, int maxCount) {
        this.name = name;
        this.maxCount = maxCount;
        count = 0;
        thread = new Thread(this);
    }
    public void start(){
        thread.start();
    }

    @Override
    public void run() {
        while (count < maxCount) {
            try {
                Thread.sleep(interval);
                System.out.printf("%s : %d%n", name, ++count);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SelfRunnableCounter counter1 = new SelfRunnableCounter("counter1", 10);
        SelfRunnableCounter counter2 = new SelfRunnableCounter("counter2", 10);

        counter1.start();
        counter2.start();
        Thread.sleep(10000);

    }
}
