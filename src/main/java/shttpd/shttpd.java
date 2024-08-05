package shttpd;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.*;

public class shttpd {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); // shttpd GET <forder name>
        String[] shttpd = input.split(" ");
        ServerSocket serverSocket = new ServerSocket(80);
        if (shttpd[1].equals("GET")) {
            while (true) {
                try (Socket socket = serverSocket.accept()) {
                    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

                    String requestLine = in.readLine();
                    if (requestLine == null || !requestLine.startsWith("GET")) {
                        return;
                    }

                    while (in.readLine().length() != 0) {

                    }

                    String directoryPath = "./your_directory";

                    String htmlContent = generateHtml(directoryPath);

                    out.println("HTTP/1.1 200 OK");
                    out.println("Content-Type: text/html; charset=UTF-8");
                    out.println("Content-Length: " + htmlContent.length());
                    out.println();
                    out.println(htmlContent);

                    in.close();
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static String generateHtml(String directoryPath) {
        StringBuilder htmlBuilder = new StringBuilder();
        htmlBuilder.append("<html><head><title>Directory Listing</title></head><body>");
        htmlBuilder.append("<h1>Directory Listing for ").append(directoryPath).append("</h1>");
        htmlBuilder.append("<ul>");

        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(directoryPath))) {
            for (Path path : directoryStream) {
                htmlBuilder.append("<li>").append(path.getFileName().toString()).append("</li>");
            }
        } catch (IOException e) {
            htmlBuilder.append("<li>Error reading directory</li>");
            e.printStackTrace();
        }

        htmlBuilder.append("</ul>");
        htmlBuilder.append("</body></html>");

        return htmlBuilder.toString();
    }
}
// ● Get명령어 받으면 -> 서버는 그 파일에 해당하는 것을 폴더 내용을 html로 출력
// ● Get/ filepath -> 파일이 존재하면 200 ok 와 파일 컨텐츠 출력, 존재하지 않으면 404, 적절한 response
// header포함
// ●