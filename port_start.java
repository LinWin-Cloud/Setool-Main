import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.FileReader;
 
public class  port_start{
 
    public static void main(String[] args) {
        System.exit(0);
    }
    public static void port_server(int port , String page , String close) throws Exception{
        System.out.println("[!]Start Http Port: "+port+" on https://localhost:"+port);
        try {
            Thread.sleep(1000); //sleep 1s
            /*listen the port*/
            ServerSocket ss = new ServerSocket(port);
 
            while (true) {
                Socket socket = ss.accept();
                BufferedReader bd = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                String requestHeader;
                int contentLength = 0;
                while ((requestHeader = bd.readLine()) != null && !requestHeader.isEmpty()) {
                    //System.out.println(requestHeader);
                    /**
                     * get "GET"'s value'
                     */
                    if (requestHeader.startsWith("GET")) {
                        int begin = requestHeader.indexOf("/?") + 2;
                        int end = requestHeader.indexOf("HTTP/");
                        String condition = requestHeader.substring(begin, end);
                        String ClassInfo = "http_server";
                        String log = condition;
                        String Error = "false";
                        log_server.log_print(ClassInfo, log, Error);
                        System.out.println("[!]Get the condition: " + condition);
                    }
                    if (requestHeader.startsWith("Content-Length")) {
                        int begin = requestHeader.indexOf("Content-Lengh:") + "Content-Length:".length();
                        String postParamterLength = requestHeader.substring(begin).trim();
                        contentLength = Integer.parseInt(postParamterLength);
                        //System.out.println("POST long：" + Integer.parseInt(postParamterLength));
                    }
                }
                StringBuffer sb = new StringBuffer();
                if (contentLength > 0) {
                    for (int i = 0; i < contentLength; i++) {
                        sb.append((char) bd.read());
                    }
                    //System.out.println("POST info：" + sb.toString());
                }
                /*send info to the client*/

                /* read the index file */
                FileReader fileReader = new FileReader(page) ;
                BufferedReader bufferedReader = new BufferedReader(fileReader) ;
                String file_print ;//make a new string value

                PrintWriter pw = new PrintWriter(socket.getOutputStream());
                pw.println("HTTP/1.1 200 OK");
                pw.println("Content-type:text/html");
                while((file_print = bufferedReader.readLine()) != null){
                    pw.println();
                    pw.println(file_print);
                    pw.flush();
                }
                if (socket != null) {
                    socket.close();
                }
                fileReader.close();
            }
        } catch (Exception e) {
            System.out.println(e);
            String ClassInfo = "http_server";
            String log = "Error: " + e;
            String error = "true";
            log_server.log_print(ClassInfo, log, error);
            setool.run_main_function();
        }
    }
    public static String ASCIItoString(String ascii) {
        StringBuffer stringBuffer = new StringBuffer();
        String[] chars = ascii.split(" ");
        for (int i = 0; i < chars.length; i++) {
            stringBuffer.append((char) Integer.parseInt(chars[i]));
        }
        return stringBuffer.toString();
    }
}
