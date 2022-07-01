import java.io.File;
import java.util.*;
import java.net.*;
public class requests_tools 
{
    public static void main(String[]args) throws Exception
    {
        requests_tools_run();
        return;
    }
    public static void requests_tools_run() throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Setool-Main//Main Console//Requests_Tools//");
        String input = scanner.nextLine();
        command_line(input);
        scanner.close();
    }
    public static void command_line(String input) throws Exception
    {
        //System.out.println(input);
        for (int i =1 ; i <= 1 ; i++){
            if (input.equals("exit"))
            {
                //go back to the main console
                setool.run_main_function();
                return;
            }
            if (input.equals("show options"))
            {
                try
                {
                    String fileconfig = "./config/requests_tools";
                    File file = new File(fileconfig);
                    setool.read_logo(file);
                    requests_tools_run();
                    return;
                }catch (Exception err)
                {
                    System.out.println(err); 
                    requests_tools_run(); 
                }
            }
	        if (input.equals("use url_resolution"))
	        {
                System.out.println("[!]Enter 'exit' to exit");
	    	    Scanner scanner = new Scanner(System.in);
                System.out.print("Setool-Main//Main Console//Requests_Tools//Url_Resolution//Enter URL:");
		        String inURL = scanner.nextLine();
                if (inURL.equals("exit"))
                {
                    requests_tools_run();
                }
                else
                {
                    URL_resolution(inURL);
                    scanner.close();
                    requests_tools_run();
                }
	        }
            if (input.equals("use get_web_code"))
            {
                //get the webpage's recouces code
                get_web_code();
            }
            if (input.equals("use get_website_info"))
            {
                Scanner in_URL = new Scanner(System.in);
                System.out.print("Setool-Main//Main Console//Requests_Tools//Web_Info//Enter URL:");
                String URL = in_URL.nextLine();
                requests_tools.get_website_info(URL);
                requests_tools_run();
                in_URL.close();
            }
            else
            {
                requests_tools_run();
                return;
            }
        }
    }
    public static void URL_resolution(String inURL) throws Exception{
        try
        {
            URL url = new URL(inURL);
            System.out.println("");
            System.out.println("URL:" + url.toString());
            System.out.println("Server Agreement:" + url.getProtocol());
            System.out.println("File Path:" + url.getFile());
            System.out.println("host:" + url.getHost());
            System.out.println("Get Path:" + url.getPath());
            System.out.println("Server Port " + url.getPort());
            System.out.println("default Port" + url.getDefaultPort());
            System.out.println("Content:"+ url.getContent());
            System.out.println("HashCode:"+url.hashCode());
            System.out.println("Users Info:" + url.getUserInfo());
            System.out.println("Get Class:" + url.getClass());
            System.out.println("");
        }
        catch (Exception err)
        {
            System.out.println(err);
        }
        finally
        {
            requests_tools_run();
        }
    }
    public static void get_web_code() throws Exception
    {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Setool-Main//Main Console//Requests_Tools//Url_Resolution//Enter URL:");
            String URL = scanner.nextLine();
            String encoding = "utf-8";
            String get_code = web_clone.getHtmlResourceByUrl(URL, encoding);
            System.out.println(get_code);
            System.out.print("[?]Do you want write to the file:[Y or N]:");
            String ch = scanner.nextLine();
            if (ch.equals("Y") || ch.equals("y"))
            {   
                String content = get_code;
                System.out.print("Enter the file name:");
                String name = scanner.nextLine();
                setool.wirte_file(content, name);
            }
            else
            {
                System.out.println("End Optioning!");
            }
        }
        catch (Exception error)
        {
            /* print error info */
            System.out.println(error);
        }
        finally
        {
            requests_tools.requests_tools_run();
        }
    }
    public static void get_website_info(String URL) throws Exception
    {
        try
        {
            //first , get ip
            InetAddress inetAddress = InetAddress.getLocalHost();
            System.out.println("");
            System.out.println("[!]Your Host-->");
            //users information
            System.out.println("Your HostName: " + inetAddress.getHostName());
            System.out.println("HashCode: " + inetAddress.hashCode());
            System.out.println("Your Host Adress: " + inetAddress.getHostAddress());
            System.out.println("");
            for (int i = 1 ; i <= 1 ; i++)
            {
                System.out.println("[!]Target Host-->");
                System.out.println("Target IP: " + InetAddress.getByName(URL));
                System.out.println("AllByName: " + InetAddress.getAllByName(URL));
                System.out.println("Class: " + InetAddress.class);
            }
            System.out.println("");
        }
        catch (Exception error)
        {
            System.out.println(error);
        }
    }
}
