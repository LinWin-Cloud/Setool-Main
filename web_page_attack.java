
import java.io.*;
import java.util.Scanner ;

public class web_page_attack {
    public static void main(String[]args) throws Exception{
        use_web_page_attack() ;
        return ;
    }
    public static void use_web_page_attack() throws Exception{
        System.out.print("Setool-Main//Main Console//Web Page Attack//");
        Scanner input = new Scanner(System.in) ;
        String options = input.nextLine() ;
        if (options.equals("exit")) {
            setool.run_main_function();
            return;
        }
        if (options.equals("show options")){
            File file = new File("config/web_page_attack") ;
            setool.read_logo(file);
            use_web_page_attack();
            return ;
        }
        if (options.equals("use 1")){
            File file = new File("index.html") ;
            file.delete();
            File config = new File("port_config/web_page_attack/page_1");
            /* read the config file */
            //the port start informations
            FileReader fileReader = new FileReader(config) ;
            BufferedReader bufferedReader = new BufferedReader(fileReader) ;
            String file_print ;//make a new string value
            while((file_print = bufferedReader.readLine()) != null){
                String cmd = "cp web_page_attack/page_1/index.html ./" ;
                exploit_social.shell1(cmd);
                int port = Integer.parseInt(file_print) ;
                view_file(port);
                int newport = Integer.parseInt(file_print) ;
                setool.start_http_port(newport);
            }
            fileReader.close(); //close the read the file
            web_page_attack.use_web_page_attack();
            return ;
        }
        if (options.equals("use 2")) {
            File file = new File("index.html") ;
            file.delete() ;
            File file1 = new File("port_config/web_page_attack/page_2") ;
            FileReader fileReader = new FileReader(file1) ;
            BufferedReader bufferedReader = new BufferedReader(fileReader) ;
            String file_print ;
            while((file_print = bufferedReader.readLine()) != null) {
                String cmd = "cp web_page_attack/page_2/index.html ./";
                exploit_social.shell1(cmd) ;
                int port = Integer.parseInt(file_print);
                view_file(port);
                int renewport = Integer.parseInt(file_print);
                setool.start_http_port(renewport);
            }
            fileReader.close();
            web_page_attack.use_web_page_attack();
            return ;
        }
        if (options.equals("set start_port 1")){
            String config_file = "page_1";
            web_page_attack.set_start_port(config_file);
            return;
        }
        if (options.equals("set start_port 2")){
            String config_file = "page_2";
            web_page_attack.set_start_port(config_file);
        }
        if (options.equals("show config")){
            view_config_port();
            web_page_attack.use_web_page_attack();
            return;
        }
        else {
            web_page_attack.use_web_page_attack();
            return;
        }
    }
    public static void set_start_port(String config_file) throws Exception {
        //users can set the start port in the console
        System.out.print("[*]Your Port Now Is: ");
        /* show now the config port */
        File file = new File("port_config/web_page_attack/" + config_file);
        setool.read_logo(file);

        //users input the int value and write to the config file
        try {
            System.out.print("[*]Set The Start Port: ");
            Scanner input = new Scanner(System.in);
            int port = input.nextInt();
            view_file(port);
            String content = String.valueOf(port);
            File delfile = new File(config_file);
            delfile.delete();
            setool.wirte_file(content, "port_config/web_page_attack/" + config_file);
            String cmd = "cp -fr "+config_file+" ./port_config/web_page_attack/" ;
            exploit_social.shell1(cmd);
            delfile.delete();
            web_page_attack.use_web_page_attack();
        } catch (Exception e) {
            System.out.println("[*]Your Input Is Not A Number, Please Try Again!");
            web_page_attack.use_web_page_attack();
        }
    }
    private static void view_file(int port) throws Exception{
        //read the port config file
        //if the port config file is the same , then alert

        /* first , read the page_1's config file */
        File file = new File("port_config/web_page_attack/page_1");
        FileReader fileread = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileread);
        String get_content_1 ;
        while((get_content_1 = reader.readLine()) != null){
            String re_1 = get_content_1 ;
            /* than , read the page_2's config file */
            File page_2_port = new File("port_config/web_page_attack/page_2");
            FileReader fileRead_2 = new FileReader(page_2_port);
            BufferedReader reader_2 = new BufferedReader(fileRead_2) ;
            String get_content_2 ;
            /* if the readline is null then stop the while*/
            while((get_content_2 = reader_2.readLine()) != null){
                System.out.println(get_content_2);
                System.out.println(get_content_1);
                try{
                    //write , read and so on
                    String other_config = get_content_2;
                    if (get_content_1.equals(other_config)){
                        System.out.println("[!]ERR:The Config Port can not the same!");
                        setool.wirte_file("1314", "page_1");
                        setool.wirte_file("1516", "page_2");
                        String cmd_1 = "cp -fr page_1 ./port_config/web_page_attack/" ;
                        String cmd_2 = "cp -fr page_2 ./port_config/web_page_attack/" ;
                        exploit_social.shell1(cmd_1);
                        exploit_social.shell1(cmd_2);
                        File tmp_1 = new File("page_1");
                        File tmp_2 = new File("page_2");
                        tmp_1.delete();
                        tmp_2.delete();
                        System.out.println("[*]The Config Port Is Changed To: 1314 , 1516");
                    }
                }
                catch (Exception e){
                    web_page_attack.use_web_page_attack();
                }
            }
        }
    }
    private static void view_config_port() throws Exception{
        //show the content of the port config
        File file_1 = new File("port_config/web_page_attack/page_1");
        File file_2 = new File("port_config/web_page_attack/page_2");
        System.out.print("[*]Your Port Config1 Now Is: ");
        setool.read_logo(file_1);
        System.out.print("[*]Your Port Config2 Now Is: ");
        setool.read_logo(file_2);
    }
}
