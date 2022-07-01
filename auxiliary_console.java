import java.util.*;
import java.io.*;
public class auxiliary_console
{
    public static void main(String[]args) throws Exception
    {
        auxiliary_console_main();
    }
    public static void auxiliary_console_main() throws Exception
    {
        //users input in this console ...
        Scanner scanner = new Scanner(System.in);
        System.out.print("Setool-Main//Auxiliary_Console//");
        String in_options = scanner.nextLine();
        /* Write the log */
        try
        {
            String ClassInfo = "auxiliary";
            String log = "Input Command: " + in_options ;
            String error = "false";
            log_server.log_print(ClassInfo , log , error);
        }
        catch (Exception err)
        {
            System.out.println(err);
            scanner.close();
        }
        try
        {
            if (in_options.equals("show options"))
            {
                //show all the project
                File file = new File("config/auxiliary");
                function.FileRead(file);
                auxiliary_console_main();
            }
            else if (in_options.equals("setool main_console"))
            {
                setool.run_main_function(); //goto the main console
            }
            else if (in_options.equals("use ssh_connect"))
            {
                auxiliary_console.ssh_connect();
            }
            else if (in_options.equals("exit"))
            {
                System.exit(0);
            }
            else if (in_options.equals("view_log"))
            {
                //look the log file
                auxiliary_console.view_log();
            }
            else
            {
                auxiliary_console.auxiliary_console_main();
            }
        }
        catch (Exception err)
        {
            System.out.print(err);
            String ClassInfo = "auxiliary";
            String log = err.toString();
            String Error = "false";
            log_server.log_print(ClassInfo , log , Error);
        }
    }
    public static void ssh_connect() throws Exception
    {
        //use ssh connect and attack from other PC or PE
        try
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Setool-Main//Auxiliary_Console//SSH_Connect//Set IP: ");
            String IP = scanner.nextLine();
            System.out.print("Setool-Main//Auxiliary_Console//SSH_Connect//Set Logon Users:");
            String Users = scanner.nextLine();
            Thread.currentThread();
            Thread.sleep(500);
            System.out.println("");
            /* use shell script */
            System.out.println("[+]Run this Shell script in your terminal(Linux)==>");
            String shellCommand = "ssh "+Users+"@"+IP+" mkdir remote&&cd remote&&wget https://gitee.com/LinWin-Cloud/packages.LinWinCloud.gitee/raw/master/Setool-ToGo/packages/Setool-ToGo.zip&&unzip Setool-ToGo.zip&&python3 setool.py";
            System.out.println("");
            System.out.println(shellCommand);
            System.out.println("");
            auxiliary_console_main();
            scanner.close();
        }
        catch (Exception err)
        {
            System.out.println(err);
            //print the log to the log file
            String ClassInfo = "auxiliary";
            String log = err.toString();
            String Error = "false";
            log_server.log_print(ClassInfo , log , Error);
        }
    }
    public static void view_log() throws Exception
    {
        //view all the log
        try
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Setool-Main//Auxiliary_Console//View_Log//");
            String options = in.nextLine();
            auxiliary_console.log_options(options);
        }
        catch (Exception err)
        {
            System.out.println(err);
            /* print the error log to the file */
            String ClassInfo = "auxiliary";
            String log = err.toString();
            String error = "true";
            log_server.log_print(ClassInfo , log , error) ;
        }
    }
    public static void log_options(String options) throws Exception
    {
        try
        {
            if (options.equals("show options"))
            {
                System.out.println("1.View Log    Enter:view");
                System.out.println("2.Delete Log  Enter:del");
                System.out.println("3.Exit        Enter:exit");
                System.out.println("========================");
                view_log();
            }
            else if (options.equals("view"))
            {
                try
                {
                    /* input the view options , cat or show */
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Cat All The Log File        Enter:cat");
                    System.out.println("Show All The Log File Name  Enter:show");
                    System.out.println("======================================");
                    System.out.println("");
                    System.out.print("Input View Options: ");
                    String view_options = scanner.nextLine();
                    if (view_options.equals("cat"))
                    {
                        //cat the log file 's content
                        cat_Log();
                        File file = new File("./cat_result.txt");
                        function.FileRead(file);
                        view_log();
                    }
                    else if (view_options.equals("show"))
                    {
                        //show all the log file , do not have file content
                        auxiliary_console.Show_Log();
                        File file = new File("./show_result.txt");
                        function.FileRead(file);
                        view_log();
                    }
                    else if (view_options.equals("exit"))
                    {
                        //return to the function: view_log
                        auxiliary_console.view_log();
                    }
                    else
                    {
                        auxiliary_console.view_log();
                    }
                }
                catch (Exception e)
                {
                    System.out.println(e);
                }
            }
            else if (options.equals("del"))
            {
                //clear all the log file
                auxiliary_console.clear_log();
                auxiliary_console.view_log();
            }
            else if(options.equals("exit"))
            {
                auxiliary_console.auxiliary_console_main();
            }
            else
            {
                auxiliary_console.view_log();
            }
        }
        catch (Exception err)
        {
            System.out.println(err);
        }
    }
    public static void cat_Log() throws Exception
    {
        //use python code cat the log content
        String cat_log = "python3 python_code/cat_file.py";
        exploit_social.shell1(cat_log);
    }
    public static void Show_Log() throws Exception
    {
        //use python code show the file , don't show the file content
        String show_log = "python3 python_code/show_file.py";
        exploit_social.shell1(show_log);
    }
    public static void clear_log() throws Exception
    {
        //clear all the log
        try
        {
            //use python script
            String del = "python3 ./python_code/del_1.py";
            exploit_social.shell1(del);
            System.out.println("[!]Delete OK");
        }
        catch (Exception err)
        {
            System.out.println(err);
        }
    }
}
