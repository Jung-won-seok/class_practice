package homework2;

import java.util.Arrays;

public class CoinChange {
    static int a = 0;
    public int coinChange(int[] coins, int amount) {
        //coinChange(coins, 2300)
        //coins[] = [ 10 50 100 500 ], amount = 2300이라 하자.
        Arrays.sort(coins);//오름차순정렬
        if(amount < 0) return -1;
        int cnt = coins.length -1;
        if (amount == 0) {
            return a;
        }else{
            for (int i = cnt; i >= 0; i--) {
                if (coins[i] <= amount) {
                    a++;
                    coinChange(coins, amount-coins [i]);
                }
            }
            return a;
        }
    }
}

