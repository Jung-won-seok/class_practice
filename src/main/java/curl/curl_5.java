package curl;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class curl_5 {
    public static void main(String[] args) {
        //scurl -v -d "{hello:world}" -H Content-Type:application/json http://httpbin.org/post
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] urlString = input.split(" ");

        //String[] urlString = input.split(" ");

        try {
            // URL 객체 생성 및 파싱
            // URL url = new URL(urlString[1]);
            URL url = new URL(urlString[6]);
            String path = "/post";
            String jsonData = urlString[3];
            String host = url.getHost();
            int port = 80;

            // 소켓 생성 및 연결
            try (Socket socket = new Socket(host, port);
                 PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                 BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

                // POST 요청 전송
                String request = "POST " + path + " HTTP/1.1\r\n" +
                        "Host: " + host + "\r\n" +
                        "Content-Type: application/json\r\n" +
                        "Content-Length: " + jsonData.length() + "\r\n" +
                        "Connection: close\r\n" +
                        "\r\n" +
                        jsonData;

                out.print(request);
                out.flush();

                String userAgent = "curl/7.79.1";
                String accept = "*/*";
                String type = "application/json";
                // 요청 header 출력
                System.out.println("POST " + path + " HTTP/1.1");
                System.out.println("Host: " + host);
                System.out.println("Connection: close");
                System.out.println("User-Agent: " + userAgent+"\r\r");
                System.out.println("Accept: "+ accept);
                System.out.println(urlString[5]);
                System.out.println("Content-Length: "+ (urlString[4].length()));
                System.out.println();

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
