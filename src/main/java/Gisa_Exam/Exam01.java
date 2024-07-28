package Gisa_Exam;

public class Exam01 {
    public static void check(int[] t, int[] k){
        if (t == k) {
            System.out.print("O");
        } else {
            System.out.print("N");
        }
    }

    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;
        int[] arr3;

        arr1 = new int[] {1, 2, 3, 4};
        arr2 = new int[] {1, 2, 3, 4};
        arr3 = new int[] {1, 2, 3};

        check(arr1, arr2);
        check(arr1, arr3);
        check(arr2, arr3);
    }
}
