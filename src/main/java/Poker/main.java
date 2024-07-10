package Poker;
import java.util.Arrays;
import java.util.Random;
public class main{
    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        Player p4 = new Player();

        int[] arr = new int[52];

        int count = 20; // 난수 생성 갯수
        int a[] = new int[count];
        Random r = new Random();

        for(int i=0; i<count; i++){
            a[i] = r.nextInt(52)+1; // 1 ~ 52까지의 난수
            for(int j=0; j<i; j++){
                if(a[i] == a[j]){
                    i--;
                }
            }
        }

        Card[] card = new Card[20];
        for(int i=0 ; i<20 ; i++){
            card[i] = new Card();
        }
        for(int i=0 ; i<20 ; i++){
            card[i].num = a[i];
            if(card[i].num <14){
                card[i].shape = "하트";
            }
            else if(card[i].num >= 14 && card[i].num < 27){
                card[i].shape = "다이아몬드";
                card[i].num = a[i]-13;
            }
            else if(card[i].num >= 27 && card[i].num < 40){
                card[i].shape = "클로버";
                card[i].num = a[i]-26;
            }
            else if(card[i].num >= 40 && card[i].num < 53){
                card[i].shape = "스페이드";
                card[i].num = a[i]-39;
            }

        }
        for(int i=0 ; i<5 ; i++){
            p1.cards[i] = card[i];
        }
        for(int i=5 ; i<10 ; i++){
            p2.cards[i-5] = card[i];
        }
        for(int i=10 ; i<15 ; i++){
            p3.cards[i-10] = card[i];
        }
        for(int i=15 ; i<20 ; i++){
            p4.cards[i-15] = card[i];
        }

        for(int i=0 ; i<5 ; i++){
            System.out.println(p1.cards[i].num + p1.cards[i].shape);
        }
        int array[] = new int[4];
        array[0] = check(p1.cards); // 1
        array[1] = check(p2.cards); // 2
        array[2] = check(p3.cards); // 2
        array[3] = check(p4.cards); // 1

        int max = 0;
        for(int i= 0 ; i<4 ; i++){
            if(max < array[i]){
                max = array[i];
            }
        }

    }
    public static int check(Card[] arr) {
        Arrays.sort(arr);
        for (Card card : arr) {
            System.out.println(card.num);
        }
        int cnt=0;
        int num=0;
        int ret = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = i+1; j < 5; j++) {
                if (arr[i].num == arr[j].num) {
                    cnt++;
                    if (j < 4 && arr[j + 1].num == arr[j].num) {
                        System.out.println("3 pair");
                        ret = 3;
                    } else if (j < 4 && arr[j + 1].num != arr[j].num && cnt == 2) {
                        System.out.println("2 pair");
                        ret = 2;
                    }
                    else if (i==3 && j==4 && cnt == 2) {
                        System.out.println("2 pair");
                        ret = 2;
                    }
                }
            }
        }
        if (cnt == 1) {
            System.out.println("1 pair");
            ret = 1;
        }
        return ret;
    }
}
