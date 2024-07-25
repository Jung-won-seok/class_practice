package Thread;

public class Count {
    int count;

    public int getCount(){
        return count;
    }
    public synchronized void increment(){
        count++;
    }
}

