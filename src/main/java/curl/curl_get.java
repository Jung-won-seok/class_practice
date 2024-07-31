package curl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class curl_get {
    public static void main(String[] args) {
        try{
            URL url = new URL("http://httpbin.org/get");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while((inputLine = in.readLine()) != null){
                response.append(inputLine+"\n");
            }

            in.close();
            System.out.println(response.toString());

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
