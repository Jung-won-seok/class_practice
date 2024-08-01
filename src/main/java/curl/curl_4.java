package curl;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class curl_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //scurl -v -X GET http://httpbin.org/get
        String input = sc.nextLine();
        String[] urlString = input.split(" ");
        if (urlString[1].equals("-v") && urlString[2].equals("-X") && urlString[3].equals("GET")) {
            try {
                // URL 객체 생성 및 파싱
                URL url = new URL(urlString[4]);
                String host = url.getHost();
                int port = 80;
                String path = url.getPath();

                // 소켓 생성 및 연결
                try (Socket socket = new Socket(host, port);
                     PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                     BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

                    String userAgent = "curl/7.79.1";
                    String accept = "*/*";
                    String Custon_header = "NA";

                    // 요청 header 출력
                    System.out.println("GET " + path + " HTTP/1.1");
                    System.out.println("Host: " + host);
                    System.out.println("Connection: close");
                    System.out.println("User-Agent: " + userAgent+"\r\r");
                    System.out.println("Accept: "+ accept);
                    System.out.println("X-Custom-Header: "+ Custon_header);
                    System.out.println();

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
}
