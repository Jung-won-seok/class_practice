package SocketProgramming;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class practice_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            Socket socket = new Socket("localhost", 8881);
            System.out.println("서버에 연결되었습니다.");

            int ch;
            while ((ch = socket.getInputStream().read()) >= 0) {
                System.out.write(ch);
            }

            socket.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
