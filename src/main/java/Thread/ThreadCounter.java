package Thread;

public class ThreadCounter extends Thread {
    static final int DEFALULT_MAX_COUNT = 10;
    static final int DEFAULT_INTERVAL = 1000;
    String name;
    int maxCount = DEFALULT_MAX_COUNT;
    int interval = DEFAULT_INTERVAL;
    int count;

    public ThreadCounter(String name, int maxCount) {
        this.name = name;
        this.maxCount = maxCount;
        count = 0;
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
        ThreadCounter counter1 = new ThreadCounter("counter", 10);
        ThreadCounter counter2 = new ThreadCounter("counter", 10);

        counter1.start();
        counter2.start();
        Thread.sleep(10000);

    }
}
