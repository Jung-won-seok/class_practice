package SocketProgramming;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
//Exam_04
public class practice_8 {
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(7878)){
            Socket socket = serverSocket.accept();
            socket.getOutputStream().write("Hello?".getBytes());
            //socket.getInputStream().read();

            int ch;
            while ((ch = socket.getInputStream().read()) >= 0) {
                socket.getOutputStream().write(ch);
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
