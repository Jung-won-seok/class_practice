import java.util.Scanner;

public class Whatday {
    static int[] daysInMonth  = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //평년
    static int[] daysInLeapMonth  = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //윤년
    static String[] monthNames = {"January", "Feburary", "March", "April", "May", "June", "July", "August", "Sepetember", "October", "November", "December"};

    public static void main(String[] args) {
        try {
            System.out.print("Enter Year Number: ");
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            int yearNum = Integer.parseInt(line);

            boolean isLeapYear = (yearNum % 4 == 0) && (yearNum % 100 != 0 || yearNum % 400 == 0);

            int maxDayNum = isLeapYear ? 366 : 365; //isLeapYear이 참이면 366  거짓이면 365, 삼항연산자

            if (isLeapYear) {
                System.out.println("it's Leap Year");
            }
            else {
                System.out.println("it's Common Year");
            }

            System.out.print("Enter a day number between 1 and 365: ");

            line = scanner.nextLine();
            int dayNum = Integer.parseInt(line);

            if (dayNum < 1 || dayNum > 365) {
                throw new IllegalArgumentException("Out of date range");
            }

            int monthNum = 0;
            if(isLeapYear) {
                for (int days: daysInLeapMonth) {
                    if (dayNum <= days) {
                        break;
                    }
                    else {
                        dayNum -= days;
                        monthNum++;
                    }
                }
            } else {
                for (int days: daysInMonth) {
                    if (dayNum <= days) {
                        break;
                    }
                    else {
                        dayNum -= days;
                        monthNum++;
                    }
                }
            }

            String monthName = monthNames[monthNum];

            System.out.printf("%s, %d ", monthName, dayNum);
            scanner.close();
        }
        catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}