import java.io.File;
import java.util.Scanner;

public class search_hacker {
    public static void main(String[] args) throws Exception {
        System.out.println("[*]Start the search_hacker tool");
        use_search_hacker();
    }
    public static void use_search_hacker() throws Exception{
        //use search_hacker
        Scanner input = new Scanner(System.in);
        System.out.print("Setool-Master//Main Console//Search_hacker//");
        String run_command = input.nextLine(); //input the options and run the command
        search_hacker.search(run_command);
    }
    public static void search(String in) throws Exception {
        //all the command in the search_hacker
        if (in.equals("show options")){
            //show all the project of the search hacker
            File file = new File("config/search_hacker");
            setool.read_logo(file);
            use_search_hacker();
            return;
        }
        if (in.equals("use search_engine"))
        {
            //use search_hacker
            for (int i = 1 ; i <= 1 ; i++)
            {
                System.out.println("");
                System.out.println("Use Baidu       Enter:baidu");
                System.out.println("Use Bing        Enter:bing");
                System.out.println("Use sogou       Enter:sogou");
                System.out.println("Use 360         Enter:360");
                System.out.println("Use Google      Enter:google");
            }
            Scanner input = new Scanner(System.in);
            System.out.print("Setool-Master//Main Console//Search_hacker//Chose Search Engine:");
            String in_search = input.nextLine();
            if (in_search.equals("baidu")) {
                //use baidu
                use_baidu();
            }
            if (in_search.equals("bing")) {
                //use bing
                use_bing();
            }
            if (in_search.equals("sogou")) {
                //use sogou
                use_sogou();
            }
            if (in_search.equals("360")) {
                //use 360
                use_search_360();
            }
            if (in_search.equals("google"))
            {
                //use google hacker
                google_hacker();
            }
        }if (in.equals("exit")){
            //exit the search_hacker
            setool.run_main_function();
            return;}
        else
        {
            search_hacker.use_search_hacker();
        }
    }
    public static void google_hacker() 
    throws Exception{
        System.out.print("[*]Start the Google search_hacker tool//Search:");
        Scanner input = new Scanner(System.in);
        String in_google = input.nextLine();
        if (in_google.equals("exit")){
            search_hacker.use_search_hacker();
            return ;
        }
        else {
            String google_search = in_google;
            function.start_webbrowser("https://go.lizmt.cn/search?q=" + google_search);
            search_hacker.use_search_hacker();
            return ;
        }
    }
    public static void use_baidu() throws Exception {
        //use baidu
        System.out.print("[*]Start the baidu search_hacker tool//Search:");
        Scanner input = new Scanner(System.in);
        String in_baidu = input.nextLine();
        if (in_baidu.equals("exit")){
            search_hacker.use_search_hacker();
            return ;
        }
        else {
            String baidu_search = in_baidu;
            function.start_webbrowser("https://www.baidu.com/s?wd=" + baidu_search);
            search_hacker.use_search_hacker();
            return ;
        }
    }
    public static void use_bing() throws Exception {
        //use bing
        System.out.print("[*]Start the bing search_hacker tool//Search:");
        Scanner input = new Scanner(System.in);
        String in_bing = input.nextLine();
        if (in_bing.equals("exit")) {
            search_hacker.use_search_hacker();
            return;
        } else {
            String bing_search = in_bing;
            function.start_webbrowser("https://www.bing.com/search?q=" + bing_search);
            search_hacker.use_search_hacker();
            return;
        }
    }
    public static void use_sogou() throws Exception {
        //use sogou
        System.out.print("[*]Start the sogou search_hacker tool//Search:");
        Scanner input = new Scanner(System.in);
        String in_sogou = input.nextLine();
        if (in_sogou.equals("exit")) {
            search_hacker.use_search_hacker();
            return;
        } else {
            String sogou_search = in_sogou;
            function.start_webbrowser("https://www.sogou.com/web?query=" + sogou_search);
            search_hacker.use_search_hacker();
            return;
        }
    }
    public static void use_search_360() throws Exception {
        //use 360
        System.out.print("[*]Start the 360 search_hacker tool//Search:");
        Scanner input = new Scanner(System.in);
        String in_360 = input.nextLine();
        if (in_360.equals("exit")) {
            search_hacker.use_search_hacker();
            return;
        } else {
            String search_360 = in_360;
            function.start_webbrowser("https://www.so.com/s?q=" + search_360);
            search_hacker.use_search_hacker();
            return;
        }
    }
}
