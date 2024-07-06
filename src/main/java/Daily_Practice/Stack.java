package Daily_Practice;
public class Stack {
    //pop, push, size
    public int arr[];
    public int top;

    public Stack(int size) {
        this.arr = new int[size];
        this.top = -1;
    }

    public void push(int num){
        arr[++top] = num;
    }

    public int pop(){
        if (top == -1) {
            System.out.println("Stack Overflow");
            return -1;
        } else {
            arr[top--] = 0;
            return arr[top];
        }

    }

    public int size(){
        return top+1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(10);

        stack.push(5);
        stack.push(7);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
