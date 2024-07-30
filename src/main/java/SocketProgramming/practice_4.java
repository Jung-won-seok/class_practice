package SocketProgramming;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class practice_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Socket socket = new Socket("localhost", 8877);
            System.out.println("서버에 연결되었습니다.");
            System.out.println("전송값 : ");
            for (int i = 0; i < 5; i++) {
                String input = sc.nextLine();
                if (input.equals("exit")) {
                } else {
                    socket.getOutputStream().write(input.getBytes());
                }
            }

            socket.close();
        } catch (IOException e) {
            System.err.println(e);
        }

    }
}