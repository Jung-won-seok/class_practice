package SocketProgramming;

import java.io.IOException;
import java.net.Socket;

public class practice_3 {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("localhost", 8887);
            System.out.println("서버에 연결되었습니다.");

            socket.getOutputStream().write("Hello World!".getBytes());
            socket.close();
        }catch(IOException e){
            System.err.println(e);
        }
    }
}
