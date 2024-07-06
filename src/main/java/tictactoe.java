import java.util.Scanner;

public class tictactoe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] board = new char[3][3];
        for(int i=0 ; i<3 ; i++){
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
        // a a a
        // a a a
        // a a a
        for (int i = 1; i <= 9; i++) {
            System.out.println("  "+board[0][0]+"  |  "+board[0][1]+"  |  "+board[0][2]+"  ");
            System.out.println("---------------");
            System.out.println("  "+board[1][0]+"  |  "+board[1][1]+"  |  "+board[1][2]+"  ");
            System.out.println("---------------");
            System.out.println("  "+board[2][0]+"  |  "+board[2][1]+"  |  "+board[2][2]+"  ");
            System.out.println("다음 수의 좌표를 입력하시오: ");

            int x = sc.nextInt(); // 0
            int y = sc.nextInt(); // 1
            if (i % 2 != 0) { //홀수일 때
                board[x][y] = 'O';
            } else {
                board[x][y] = 'X';
            }
            for (int p = 0; p < 3; p++) {
                if (board[p][0] == 'O' && board[p][1] == 'O' && board[p][2] == 'O') {
                    System.out.println("1번 플레이어의 승리!");
                    return;
                }
                if (board[p][0] == 'X' && board[p][1] == 'X' && board[p][2] == 'X') {
                    System.out.println("2번 플레이어의 승리!");
                    return;
                }
                if (board[0][p] == 'O' && board[1][p] == 'O' && board[2][p] == 'O') {
                    System.out.println("1번 플레이어의 승리!");
                    return;
                }
                if (board[0][p] == 'X' && board[1][p] == 'X' && board[2][p] == 'X') {
                    System.out.println("2번 플레이어의 승리!");
                    return;
                }
            }
            if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
                System.out.println("1번 플레이어의 승리!");
            }
            if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
                System.out.println("2번 플레이어의 승리!");
            }
        }
    }
}
