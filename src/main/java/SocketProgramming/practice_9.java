package SocketProgramming;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

//Quiz_09
//Server 화면에 "Client[127.0.0.1:38832]가 연결되었습니다." 출력
public class practice_9 {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5566)) {
            System.out.println("서버가 시작되었습니다.");
            try (Socket socket = serverSocket.accept()) {
                InetAddress clientAddress = socket.getInetAddress();
                int clientPort = socket.getPort();
                String message = "Client[" + clientAddress.getHostAddress() + ":" + clientPort + "]가 연결되었습니다.";
                System.out.println(message);
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
