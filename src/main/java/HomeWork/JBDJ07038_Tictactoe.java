package HomeWork;

import java.util.Scanner;

public class JBDJ07038_Tictactoe {
    public static char[][] board;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        board = new char[3][3];
        for(int i=0 ; i<3 ; i++){
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }

        for (int i = 1; i <= 9; i++) {
            board_state(); //현재 board 상태

            int x = sc.nextInt(); // 0
            int y = sc.nextInt(); // 1

            if (i % 2 != 0) { //홀수일 때
                board[x][y] = 'O';
            } else {
                board[x][y] = 'X';
            }
            row_test();
            col_test();
            cross_test();
        }
    }
    public static void board_state() { //현재 보드 상태
        System.out.println("  "+board[0][0]+"  |  "+board[0][1]+"  |  "+board[0][2]+"  ");
        System.out.println("---------------");
        System.out.println("  "+board[1][0]+"  |  "+board[1][1]+"  |  "+board[1][2]+"  ");
        System.out.println("---------------");
        System.out.println("  "+board[2][0]+"  |  "+board[2][1]+"  |  "+board[2][2]+"  ");
        System.out.print("다음 수의 좌표를 입력하시오: ");
    }

    public static void row_test() { //가로 검사
        for (int p = 0; p < 3; p++) {
            if (board[p][0] == 'O' && board[p][1] == 'O' && board[p][2] == 'O') {
                System.out.println("Computer Win");
                return;
            }
            if (board[p][0] == 'X' && board[p][1] == 'X' && board[p][2] == 'X') {
                System.out.println("You Win");
                return;
            }
        }
    }

    public static void col_test() { //세로 검사
        for (int p = 0; p < 3; p++) {
            if (board[0][p] == 'O' && board[1][p] == 'O' && board[2][p] == 'O') {
                System.out.println("Computer Win!");
                return;
            }
            if (board[0][p] == 'X' && board[1][p] == 'X' && board[2][p] == 'X') {
                System.out.println("You Win");
                return;
            }
        }
    }

    public static void cross_test() { //대각선 검사
        if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
            System.out.println("Computer Win");
        }
        if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
            System.out.println("You Win");
        }
    }

}
