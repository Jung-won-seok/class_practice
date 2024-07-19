package homework2;

import java.util.Scanner;

public class SubsetSumProblem1 {
    public static void main(String[] args) {
        SubsetSum subsetSum = new SubsetSum();
        try (Scanner scanner = new Scanner(System.in)) {

            String numbersLine = scanner.nextLine(); //배열
            String sumLine = scanner.nextLine(); //목표합

            String[] numberStrings = numbersLine.split("\\s");

            int[] numbers = new int[numberStrings.length];
            for (int i = 0; i < numberStrings.length; i++) {
                numbers[i] = Integer.parseInt(numberStrings[i]);
            }

            int sum = Integer.parseInt(sumLine);

            boolean result = subsetSum.isSubsetSum(numbers, numbers.length, sum);
            System.out.println(result);
        }

    }
}
