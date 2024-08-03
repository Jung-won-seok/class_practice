package Thread;

public class Counter {
    static final int DEFALULT_MAX_COUNT = 10;
    static final int DEFAULT_INTERVAL = 1000;
    String name;
    int maxCount = DEFALULT_MAX_COUNT;
    int interval = DEFAULT_INTERVAL;
    int count;
    public Counter(String name, int maxCount){
        this.name = name;
        this.maxCount = maxCount;
        count=0;
    }
    public void run(){
        while(count  < maxCount){
            try{
                Thread.sleep(interval);
                System.out.printf("%s : %d%n", name, count++);
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        Counter counter1 = new Counter("counter_1", 10);
        Counter counter2 = new Counter("counter_2", 10);
        counter1.run();
        counter2.run();
    }
}