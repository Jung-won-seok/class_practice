package SocketProgramming;

import java.io.IOException;
import java.net.Socket;

public class practice_2 {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("localhost", 8889);
            System.out.println("Remote address : 127.0.0.1");
            System.out.println("Remote port : " + socket.getPort());
        }catch(IOException e){
            System.err.println(e);
        }
    }
}