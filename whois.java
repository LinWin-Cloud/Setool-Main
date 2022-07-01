import java.io.File;
import java.io.IOException;
import java.util.Scanner ;
public class whois 
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("[*]Start the whois tool");
        use_whois();
    }
    public static void use_whois() throws Exception
    {
        try
        {
            //use whois
            Scanner input = new Scanner(System.in);
            System.out.print("Setool-Main//Main Console//Whois//");
            String options = input.nextLine(); //the users input in the console
            if (options.equals("exit"))
            {
                setool.run_main_function();
            }
            if (options.equals("show options"))
            {
                //show all the project of the whois
                File file = new File("config/whois");
                setool.read_logo(file);
                whois.use_whois();
            } 
            if (options.equals("use py_whois"))
            {
                //use python code and get the result
                Scanner input_py = new Scanner(System.in);
                System.out.println("[!]Enter 'exit' to exit");
                System.out.print("Setool-Main//Main Console//Whois//Enter the domain name: ");
                String options_py = input_py.nextLine(); 
                if (options_py.equals("exit"))
                {
                    whois.use_whois(); //goto the function: use_whois
                }
                else
                {
                        String domain = options_py;
                        py_domain_name(domain);
                        whois.use_whois();
                }
            }
            if (options.equals("use web_whois"))
            {
                //use web whois and get the result
                Scanner input_web = new Scanner(System.in);
                System.out.print("Setool-Main//Main Console//Whois//Enter the domain name: ");
                String url = input_web.nextLine();
                if (url.equals("exit"))
                {
                    whois.use_whois();
                }
                else
                {
                    web_domain_name(url);
                    whois.use_whois();
                }
            }
            else
            {
                whois.use_whois(); 
            }
        }
        catch (Exception err)
        {
            System.out.println(err); //print the error information
        }
    }
    private static void py_domain_name(String domain) throws Exception
    {
        //python code to whois
        try
        {
            /* write the domain name to the file */
            String content = domain ;
            String name = "whois.txt";
            setool.wirte_file(content, name);
            /* run the python code */
            String run_py = "python3 python_code/whois_view.py";
            exploit_social.shell1(run_py);
            /* read the file: whois_result.txt and print it on the console */
            String FilePath = "whois_result.txt";
            File file = new File(FilePath);
            setool.read_logo(file);
        }
        catch (Exception err)
        {
            System.out.println(err);
            String ClassInfo = "whois";
            String log = err.toString();
            String error = "true";
            log_server.log_print(ClassInfo, log, error); //print the log
        }
    }
    private static void web_domain_name(String domain) throws Exception 
    {
        //web whois to get the result
        String url = "https://www.whois.com/whois/" + domain ;
        System.out.println("[*]The URL is:" + url);
        function.start_webbrowser(url);
    }
    public static void delfile() throws IOException
    {
        File file1 = new File("whois.txt");
        File file2 = new File("whois_result.txt");
        File file3 = new File("./python_code/modle/whois.txt");
        file1.delete();
        file2.delete();
        file3.delete();
    }
}
