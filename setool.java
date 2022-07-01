
import java.util.Scanner ;

import java.io.*;

public class setool{
    public static void main(String[] args) throws Exception {
        //prepare for the start
        String ClassInfo = "Setool_RUN";
        String log = "Start The Setool_Main";
        String error = "false";
        try
        {
            //is root running?
            String users = System.getProperty("user.name");
            if (users.equals("root"))
            {
                System.out.println("[ERR]Do not Run As Root!");
                System.exit(0);
            }
            else
            {
                log_server.log_print(ClassInfo, log, error);
                setool.start_running();
            }
        }
        catch(Exception e)
        {
            System.out.println("Error: " + e);
        }
    } 
    public static void read_logo(File file) throws Exception {
        /*
         * this function is read the text file and print in the console
         * must input a file value in from the function
         */
        //make a new file object

        FileReader fileReader = new FileReader(file) ;
        BufferedReader bufferedReader = new BufferedReader(fileReader) ;
        String file_print ;//make a new string value
        while((file_print = bufferedReader.readLine()) != null){
            System.out.println(file_print);
        }
        fileReader.close();
    }
    public static void get_version() throws Exception
    {
        //first , download the versiton zip
        //use python
        String in_file = "./tmp/version.txt";
        function.Reture_Read(in_file);
    }
    public static void start_running() throws Exception
    {
        //if the main console start then run this function
        System.out.println("[!]Start The Setool_Main ... ...");
        Thread.sleep(500*1); //sleep
        String run = "get_verstion.py";
        function.Run_Python(run);
        File file = new File("./tmp/version.txt");
        System.out.println("[!]View Updated Version:");
        function.FileRead(file);
        Thread.sleep(50*1); //sleep
        System.out.println("[!]====Start The Main_Console ... ...");
        Thread.sleep(20*1); //sleep
        System.out.println("[!]========Start The Auxiliary_Console ... ...");
        Thread.sleep(20*1); //sleep
        System.out.println("[!]========Start The Log_Server ... ...");
        Thread.sleep(20*1); //sleep
        System.out.println("[!]========Java_Version: " + System.getProperty("java.version"));
        Thread.sleep(10*1); //sleep
        System.out.println("[!]========net_Version: " + System.getProperty("java.net.version"));
        Thread.sleep(10*1); //sleep
        System.out.println("[!]========OS_Version: " + System.getProperty("os.name"));
        Thread.sleep(10*1); //sleep    
        System.out.println("[!]========Start Time: "+log_server.Get_Now_Time_Hour());
        Thread.sleep(10*1); //sleep
        System.out.println("[!]========This Version: ");
        File ver = new File("./endtion");
        Thread.sleep(10*1); //sleep
        System.out.println("[!]========Start Server... ...");
        Thread.sleep(10*1); //sleep
        System.out.println("[!]========Start Http Server... ...");
        Thread.sleep(10*1); //sleep
        System.out.println("[!]========Loading Exploit_Social ... ...");
        Thread.sleep(10*1); //sleep
        function.FileRead(ver);
        /**
         * then run function:run()
         */
        //run the start logo
        File logo_file = new File(setool.class.getResource("config/logo").getFile());
        try {
            setool.read_logo(logo_file);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        /**
         *show the help
         */
        out_help() ;
        run_main_function();
    }
    public static void out_help(){
        //if start than run this function
        System.out.println("[*]Enter 'help' to get help.");
        System.out.println("[*]Enter 'show options' to show all the projects.");
        return ;
    }
    public static void run_main_function() throws Exception{
        System.out.print("Setool-Main//Main Console//");
        Scanner input = new Scanner(System.in) ;
        String run_command = input.nextLine() ;
        setool.command(run_command);
        input.close();
    } 
    public static void command(String in) throws Exception{
        try
        {
            String ClassInfo = "Setool_RUN";
            String log = "Input Command: "+in ;
            String error = "false";
            log_server.log_print(ClassInfo, log, error);
        }
        catch (Exception err)
        {
            System.out.println(err);
        }
        //all the command in the setool-main
        String c1 = new String("show options") ;
        String c2 = new String("setool -endtion") ;
        String c3 = new String("exit") ;
        String c4 = new String("setool -get") ;
        String c5 = new String("use exploit_social") ;
        String c6 = new String("clear -workpath") ;
        String c7 = new String("use web_clone") ;
        String c8 = new String("use shodan_search") ;
        String c9 = new String("use web_get_users") ;
        String c10 = new String("use web_terminal") ;
        String c11 = new String("setool_main -get") ;
        String c12 = "use web_console" ;
        String c13 = "use script_attack" ;
        //if ... than ...
        if(in.equals(c1)){ //if in == c1 than run this code
            /*
             * show all the options
             */
            String options_read = "config/options" ;
            File options = new File(setool.class.getResource(options_read).getFile()) ;
            read_logo(options);
            setool.run_main_function();
            return ;
        }else if(in.equals(c2)){ //show the vistion information
            File vistion_file = new File(setool.class.getResource("config/endtion").getFile());
            setool.read_logo(vistion_file);
            setool.run_main_function();
            return ;
        }else if (in.equals(c3)){
            System.exit(0); //qiut
        }
        else if(in.equals(c4)) {
            //show the resoureces code's link
            File setool_get = new File("./config/setool_get");
            read_logo(setool_get);
            System.out.println("");
            setool.run_main_function();
            return ;
        }else if(in.equals(c5)){
            //use social Engnnering
            exploit_social.in();
            return ;
        }else  if (in.equals(c6)){
            String show = "yes" ;
            setool.clear_work_path(show);
            setool.run_main_function() ;
            return ;
        }else if (in.equals(c7)){
            //use payload:web clone
            web_clone.main_function();
            return ;
        }else if (in.equals(c8)){
            //use payload:shodan search
            shodan_search.shodansearch();
            return ;
        }
        else if (in.equals(c9)){
            //use payload:web get users
            web_get_users.get_users();
            return ;
        }else if (in.equals(c10)){
            //use web terminal
            /* auther:LinWinCloud ; https://github.com/LinWin-Cloud/Web_Terminal */
            File del_file = new File("./index.html") ;
            del_file.delete();
            String cmd = "cp Web_Terminal/index.html ./" ;
            int portname = 8787 ;
            exploit_social.shell1(cmd);
            start_http_port(portname);
            System.out.println("[!]You can use the web terminal in the browser:http://localhost:8787/");
            run_main_function();
        }
        else if (in.equals(c11)){
            //show how to get the setool main
            System.out.println("[]");
            String url = "https://github.com/LinWin-Cloud/setool-main" ;
            System.out.println("You can get Setool Main in the URL:" + url);
            System.out.println("[*]You can get the source code in the URL:" + url);
            setool.run_main_function();
            return ;
        }
        else if (in.equals(c12)){
            //run the web console
            File file = new File("index.html") ;
            file.delete() ; //first , delete the file in the work path
            String cmd = "cp Web_Console/index/index.html ./";
            exploit_social.shell1(cmd); //use linux command
            int portname = 8989 ;
            start_http_port(portname); //start the http port , use python
            run_main_function();
            return ;
        }
        else if (in.equals("show payload info")){
            //show all the payload's information
            /*
             * users can look the information all the tools and payload
             */
            Scanner input = new Scanner(System.in) ;
            File file = new File("config/payload") ;
            System.out.println("[*]Show all the payloads:");
            read_logo(file); 
            System.out.print("[!]You can show the information of the payloads by input the name of the payloads:");
            String in_payload = input.nextLine() ;
            if (in_payload.equals("exit")){
                setool.run_main_function();
            }else{
                String payload_name = in_payload ;
                setool.payload_info(payload_name);
                System.out.println("");
                run_main_function();
            }
        }
        else if (in.equals(c13)){
            //use script attack
            script_attack.use_script_attack();
            return ;
        }
        else if (in.equals("clear -script")){
            //clear the script
            script_attack.clear_script();
            run_main_function();
            return ;
        }
        else if (in.equals("use web_page attack")){
            //use web page attack
            web_page_attack.use_web_page_attack();
            return ;
        }
        else if (in.equals("use search_hacker")){
            //use search_hacker
            search_hacker.use_search_hacker();
            return ;
        }
        else if (in.equals("use whois")){
            //use whois
            whois.use_whois();
        }
        else if (in.equals("use web_ip")){
            //use web page get users ip address
            web_ip.use_web_ip();
            return;
        }
        else if (in.equals("use web_location")){
            //get the users location information
            web_location();
        }
        else if (in.equals("use http_server")){
            use_http_server(); //the users can start the http port
        }
        else if (in.equals("use requests_tools")){
            //use python code 
            /* requests */
            requests_tools.requests_tools_run();
        }
        else if (in.equals("show tools"))
        {
            //show all the tools in the setool main
            File file = new File("./config/All_Tools");
            function.FileRead(file);
            setool.run_main_function();
        }
        else if (in.equals("setool auxiliary_console"))
        {
            //change the main console to auxiliary console
            auxiliary_console.auxiliary_console_main();
        }
        else if (in.equals("use QRcode attack"))
        {
            //make a QRcode and save
            QRcode.Make_QRcode();
        }
        else if (in.equals("get sys_info"))
        {
            //get the information of this system
            Get_SYS_info.Main_Get();
            setool.run_main_function();
        }
        else if (in.equals("use threaten"))
        {
            //use threaten
            threaten.threaten_main();
        }
        else if (in.equals("help"))
        {
            //get the help
            File file = new File("config/help");
            function.FileRead(file);
            setool.run_main_function();
        }
        else{
            setool.run_main_function() ;
            return ;
            /**
             * else than return to the function : run_main_function ;
             */
        
        } 
    }
    public static void use_http_server() throws Exception{ 
        Scanner scanner = new Scanner(System.in);
        try{
            /* the value must int */
            System.out.print("Setool-Main//Main Console//Http_Server//Input Start Port:");
            int server_in_port = scanner.nextInt(); //users input in the console
            try{
                /* users can input String value in the console */
                try{
                    System.out.print("Setool-Main//Main Console//Http_Server//Input Server Page Path:");
                    Scanner str_in = new Scanner(System.in);
                    String server_in_page = str_in.nextLine();
                    /*users input the page path */
                    File path = new File(server_in_page); //STring to File
                    if (!path.exists()){
                        //the file is not exists
                        System.out.println("[Err]File do not find!");
                        run_main_function();
                    }
                    /* post the value and start the http port and server */
                    int port = server_in_port;
                    String page = server_in_page;
                    String close = "true";
                    port_start.port_server(port, page, close);
                    str_in.close();
                    scanner.close();
                    run_main_function();
                }catch(Exception err){
                    System.out.println(err);
                    String ClassInfo = "Setool_RUN";
                    String log = err.toString();
                    String error = "true" ;
                    log_server.log_print(ClassInfo, log, error);
                    setool.run_main_function();
                }
            }catch(Exception err){
                System.out.println(err);
                setool.run_main_function();
            }
        }catch(Exception err)
        {
            System.out.println(err);
            setool.run_main_function();
        }
        
    }
    public static void clear_work_path(String show){
        //clear all the tmp file in the work path
        File tmp_file1 = new File("index.html") ;
        File tmp_file2 = new File("pass.html");
        File tmp_file3 = new File("clone.html");
        tmp_file3.delete() ;
        tmp_file2.delete() ;
        if(tmp_file1.delete()){ //if all the file delete than run after
            //delete the file win
            String print_console = "yes" ;
            if (print_console.equals(show)){
                //if the value : show is 'yes' than print the content to the console
                System.out.println("[!]Clear The Work Path Ok");
                return ;
            }else{
                /*
                * do not print the content to the console
                */
                return ;
            }
        }else{
            //do not delete files
            String print_console = "yes" ;
            if (print_console.equals(show)){
                System.out.println("[!]Do Not delete the files");
                return ;
            }else{
                return ;
            }
        }
    }
    public static void start_http_port(int portname){
        String start_port = "python3 -m http.server "+portname ;
        System.out.println("[!]Started Http server:http://localhost:"+portname);
        exploit_social.shell1(start_port);
        return ;
    }
    public static void wirte_file(String content , String name){
        try{
            File file =new File(name);
            file.delete() ;
            if(!file.exists()){ 
                file.createNewFile();
            }
            BufferedWriter output = new BufferedWriter(new FileWriter(file)); 
            output.write(content);
            output.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void payload_info(String payload_name) throws Exception{
        //show the payload's information
        try{
            File payload_info = new File("payload_info/"+payload_name) ;
            read_logo(payload_info); //read the config file
            return ;
        }catch(Exception e){
            System.out.println("[!]The payload is not exist");
        }
        finally{
            setool.run_main_function();
        }
    }
    public static void web_location() throws Exception{
        //get the users location from web page
        Scanner input = new Scanner(System.in);
        System.out.print("Setool-Main//Main Console//Web Location//");
        String location_in = input.nextLine();
        if (location_in.equals("exit")){
            setool.run_main_function();
            return ;
        }
        if (location_in.equals("show options")){
            File file = new File("config/web_location");
            setool.read_logo(file);
            setool.web_location();
            return ;
        }
        if (location_in.equals("use 1")){
            //use the web location payload
            /* use baidu network disk attack to get location */
            int port = 8080 ;
            String page = "framework/GPS/index.html";
            String close = "true";
            port_start.port_server(port, page, close); /*start the http port */
            setool.run_main_function();
            return;
        }
        else{
            web_location(); //goto the function :web_location
            return;
        }
    }
}
