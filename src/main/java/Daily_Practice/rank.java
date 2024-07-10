package Daily_Practice;

import java.util.Arrays;

public class rank {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 4};
        Arrays.sort(arr);
        int cnt=0;
        int num=0;
        for (int i = 0; i < 4; i++) {
            for (int j = i+1; j < 5; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                    if (j < 4 && arr[j + 1] == arr[j]) {
                        System.out.println("3 pair");
                        return;
                    } else if (j < 4 && arr[j + 1] != arr[j] && cnt == 2) {
                        System.out.println("2 pair");
                    }
                    else if (i==3 && j==4 && cnt == 2) {
                        System.out.println("2 pair");
                    }
                }
            }
        }
        if (cnt == 1) {
            System.out.println("1 pair");
        }
    }
}
