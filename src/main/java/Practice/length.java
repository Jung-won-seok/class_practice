package Practice;

public class length {
    static int addAll(int...k){
        int result = 0;
        for(int i : k){
            result += i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(addAll(1, 2));
        System.out.println(addAll(1, 2, 3));
        System.out.println(addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
}
