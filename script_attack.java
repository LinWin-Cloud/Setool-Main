
import java.util.Scanner;
import java.io.File;
public class script_attack {
    public static void main(String[]args) throws Exception{
        //main function
        //run the function : use_script_attack
        System.out.println("[!]You can enter 'exit' return to the main console");
        System.out.println("[!]Enter 'show options' to show the options");
        script_attack.use_script_attack();
        return ;
    }
    public static void use_script_attack() throws Exception {
        Scanner input = new Scanner(System.in) ;
        System.out.print("Setool-Main//Main Console//Script_Attack//");
        String options = input.nextLine() ;
        String c1 = "show options" ;
        if (options.equals(c1))
        {
            //show all the project
            File file = new File("config/script_attack") ;
            setool.read_logo(file);
            script_attack.use_script_attack();
            return;
        }
        if (options.equals("use 1")){
            //use blue screen script
            String script_name_id = "blue_screen.bat" ;
            chose_script(script_name_id);
            script_attack.use_script_attack();
            return;
        }
        if (options.equals("use 2")){
            //use file script
            String script_name_id = "file_virus.bat" ;
            chose_script(script_name_id);
            script_attack.use_script_attack();
            return;
        }
        if (options.equals("use 3")){
            //use key_virus script
            String script_name_id = "key_virus.vbs" ;
            chose_script(script_name_id);
            script_attack.use_script_attack();
            return;
        }
        if (options.equals("use 4")){
            //use key_virus_plus script
            String script_name_id = "key_virus_plus.exe" ;
            chose_script(script_name_id);
            script_attack.use_script_attack();
            return;
        }
        if (options.equals("use 5")){
            //use win_virus script
            String script_name_id = "win_virus.vbs" ;
            chose_script(script_name_id);
            script_attack.use_script_attack();
            return;
        }
        if (options.equals("use 6")){
            //use window_virus script
            String script_name_id = "window_virus.bat" ;
            chose_script(script_name_id);
            script_attack.use_script_attack();
            return;
        }
        if (options.equals("use 7")){
            //use zip_virus script
            String script_name_id = "zip_virus_ghost_win.exe" ;
            chose_script(script_name_id);
            script_attack.use_script_attack();
            return;
        }
        if (options.equals("clear -script")){
            //clear the script
            clear_script();
            script_attack.use_script_attack();
        }
        if (options.equals("exit")){
            //exit the program
            setool.run_main_function();
            return;
        }
        else {
          script_attack.use_script_attack();
        }
    }
    public static void clear_script(){
        //clear the script
        File file_1 = new File("blue_screen.bat") ;
        File file_2 = new File("file_virus.bat") ;
        File file_3 = new File("key_virus.vbs") ;
        File file_4 = new File("key_virus_plus.exe") ;
        File file_5 = new File("win_virus.vbs") ;
        File file_6 = new File("window_virus.bat") ;
        File file_7 = new File("zip_virus_ghost_win.exe") ;
        file_1.delete();
        file_2.delete();
        file_3.delete();
        file_4.delete();
        file_5.delete();
        file_6.delete();
        file_7.delete();
        System.out.println("Script has been cleared");
        return ;
    }
    public static void chose_script(String script_name_id){
        //chose the attack script and copy it to the work path
        //System.out.println(script_name_id) ;
        String cmd = "cp basic_virus/virus/"+script_name_id+" ./" ;
        File file = new File(script_name_id);
        exploit_social.shell1(cmd);
        System.out.println(cmd);
        System.out.println("[*]Save The Attack Script To The Work Path");
        System.out.println("[*]The Attack Script Is : "+script_name_id);
        return;
    }
}
