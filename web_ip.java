public class web_ip {
    public static void main(String[]args) throws Exception {
        //use web page get users ip address
        web_ip.use_web_ip();
    }
    public static void use_web_ip() throws Exception {
        /* first , start the http port */
        int port = 8080 ;
        String page = "./framework/web_ip/index.html";
        String closs = "true";
        port_start.port_server(port , page , closs);
        setool.run_main_function();
    }
}
