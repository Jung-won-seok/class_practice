package MyArrays;

import java.util.Random;

public class MyArrays {
    public static void reverse(int[] a) { // a[] = [ 7 6 5 4 3 2 1 ]
        int start = 0;
        int end = a.length - 1;
        int temp = 0;
        while (start < end) {
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    //배열 a[]와 b[]의 모든 요소를 포함하는 배열을 생성해 반환하는 메서드를 작성하고, 테스트하세요.
    public static Object[] concatenate(Object[] a, Object[] b){
        //a[] = [1 2 3], b[] = [5 5 5 5 5], sum[] = [1 2 3 5 5 5 5 5]
        int size = a.length + b.length; //8
        Object[] sum = new Object[size]; //
        for (int i = 0; i < a.length; i++) {
            sum[i] = a[i]; //sum[] = [1 2 3]
        }
        for (int i = 0; i < b.length; i++) {
            sum[i+a.length] = b[i]; //sum[] = [ 1 2 3 5 5 5 5 5 ]
        }
        return sum;
    }

    //배열의 요소를 무작위로 섞는 메스드를 작성하고, 테스트하세요.
    public static void shuffle(Object[] a){
        Random random = new Random();
        //a[] = [ 1 2 3 4 5 6 7 ]
        for (int i = 0; i < a.length; i++) {
            int r = random.nextInt(i+1);
            Object temp = a[r];
            a[r] = a[i];
            a[i] = temp;
        }
    }

    //주어진 문자열에서 대소문자 구분 없이 문자 빈도를 계산한 26개의 정수 배열을 반환하는 메서드를 작성하고, 테스트하세요.
    public static int[] tally(String string){
        int[] num = new int[26];
        string = string.toLowerCase();
        char[] arrChar = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            num[arrChar[i]-'a']++;
        }
        return num;
    }

    public static void sieveOfEratosthenes(int size) {
        boolean[] num = new boolean[size];
        num[0] = num[1] = true;

        for (int i = 2; i < 30; i++) {
            for (int j = i + 1; j < size; j++) {

                if (j % i == 0) {
                    num[j] = true;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            if (num[i] == false) {
                System.out.print(i+" ");
            }
        }
    }
    public static int[][] pascalTriangle(int size) {
        int[][] t = new int[size][];
        for (int i = 0; i < size; i++) {
            t[i] = new int[i + 1];
            t[i][0] = t[i][i] = 1; // 첫 번째와 마지막 요소를 1로 설정
            for (int j = 1; j < i; j++) {
                t[i][j] = t[i-1][j-1] + t[i-1][j]; // 올바른 요소의 합 계산
            }
        }
        return t;
    }
    public static int[] withoutDuplicates(int[] a) { // 중복제거 메서드 a[] = [ 1 2 5 5 6 7 7 8 ]
        boolean swapped;
        for (int i = 0; i < a.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    // 요소 교환
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }
            // 이번 패스에서 교환이 일어나지 않았다면 배열이 정렬된 것이므로 반복을 종료
            if (!swapped) {
                break;
            }
        }

        int cnt = 1;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                cnt++;
            }
        }
        int[] arr = new int[cnt];
        int num = 0;
        for (int i = 0; i < a.length - 1; i++) {// 0~7
            if (a[i] != a[i + 1]) {
                arr[num] = a[i];
                num++;
            }
        }
        return arr;
    }




    public static void main(String[] args) {
        for (int[] row : pascalTriangle(5)) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }


    }
}
////abcdefghijklmnopqrstuvwxyz
//int[] num = new int[26];
//char[] arrChar = string.toCharArray();
//        for (int i = 0; i < arrChar.length; i++) {
//        Character.isLowerCase(arrChar[i]);
//        }