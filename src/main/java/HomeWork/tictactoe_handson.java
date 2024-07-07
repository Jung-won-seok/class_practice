package HomeWork;

import java.util.Scanner;

public class tictactoe_handson {
    public static void main(String[] args) {
        Player p1 = new Player('O');
        Player p2 = new Player('X');
        Game game = new Game(3, p1, p2);

        Scanner sc = new Scanner(System.in);

        char[][] board = new char[3][3];
        for(int i=0 ; i<3 ; i++){
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }

        //중간에서 게임 진행자 한명 필요함. 입력받으면 보드에 돌 둬주는 역할(중간다리) -> 컨트롤러
        //뷰 역할 클래스? 보여주는 것
        //플레이어가 모델
        for (int i = 0; i < 9; i++) {

        }

    }
}
