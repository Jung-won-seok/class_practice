import java.util.Scanner;
import java.util.Stack;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int k = sum(x, y);
        System.out.println(k);
    }
    public static int sum(int a, int b) {
        int result = 0;
        result = a + b;
        return result;
    }
}
