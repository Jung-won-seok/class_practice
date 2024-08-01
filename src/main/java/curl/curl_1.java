package curl;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class curl_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //scurl http://httpbin.org/get
        String input = sc.nextLine();
        String[] urlString = input.split(" ");

        try {
            // URL 객체 생성 및 파싱
            URL url = new URL(urlString[1]);
            String host = url.getHost();
            int port = 80;
            String path = url.getPath();

            // 소켓 생성 및 연결
            try (Socket socket = new Socket(host, port);
                 PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                 BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

                // HTTP GET 요청 전송
                out.print("GET " + path + " HTTP/1.1\r\n");
                out.print("Host: " + host + "\r\n");
                out.print("Connection: close\r\n");
                out.print("\r\n");
                out.flush();

                // 서버 응답 읽기 및 출력
                String responseLine;
                while ((responseLine = in.readLine()) != null) {
                    System.out.println(responseLine);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
