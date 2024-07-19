package homework2;

import java.util.Scanner;

public class CoinChangeProblem {
    public static void main(String[] args) {
        CoinChange coinChange = new CoinChange();
        try (Scanner scanner = new Scanner(System.in)) {

            String coinsLine = scanner.nextLine();//동전 종류 -> 10 50 100 500
            String amountLine = scanner.nextLine();//목표 금액 -> 2300

            String[] words = coinsLine.split("\\s"); //word[] = [ 10, 50, 100, 500 ]

            int[] coins = new int[words.length];
            for (int i = 0; i < words.length; i++) {
                coins[i] = Integer.parseInt(words[i]); //coins[] = [ 10, 50, 100, 500 ]
            }

            int amount = Integer.parseInt(amountLine); //2300

            int result = coinChange.coinChange(coins, amount); //coinChange(coins, 2300)
            System.out.println(result);
        }
    }

}
