package Thread;

public class SharedCounter extends Thread {
    SharedCount sharedCount;
    int count;
    int maxCount;

    public SharedCounter(String name, int maxCount, SharedCounter sharedCount) {
        setName(name);
        //this.sharedCount = sharedCount;
        this.maxCount = maxCount;
        count = 0;
    }

    @Override
    public void run() {
        while (count < maxCount) {
            count++;
            sharedCount.increment();
        }
    }
}

