
import java.util.Scanner;
import java.io.InputStreamReader;
import java.net.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
public class web_clone {
    public static void main(String[]args) throws IOException , Exception{
        web_clone.main_function();
        return ;
    }
    public static void main_function() throws Exception{
        System.out.println("[!]Enter 'exit' to exit.");
        System.out.print("Setool-Main//Main Console//Web Clone//");
        Scanner input = new Scanner(System.in) ;
        String options = input.nextLine() ;
        web_clone.clone(options);
        input.close();
        return ;
    }
    public static void clone(String options) throws IOException , Exception{
        String c1 = new String("use html5 clone") ;
        String c2 = new String("use java8 clone") ;
        String c3 = new String("use python3 clone") ;
        String c4 = new String("show options") ;
        String exit = new String("exit") ;
        if (options.equals(c1)){
            //use html5 clone the web site
            Scanner input = new Scanner(System.in) ;
            System.out.print("Setool-Main//Main Console//Web Clone//Write The URL:");
            String target = input.nextLine() ;
            if (target.equals(exit)){
                web_clone.main_function();
                return ;
            }else{
                String content = "<style>body{margin:0;padding:0}iframe{width:100%;height:100%}</style><iframe src='"+target+"'></iframe>";
                String name = "clone.html" ;
                setool.wirte_file(content, name);
                int port = 8080 ;
                String page = "clone.html" ;
                String close = "no" ;
                port_start.port_server(port, page , close);
                web_clone.main_function();
                return ;
            }
        }if(options.equals(c2)){
            //use java clone
            Scanner input = new Scanner(System.in) ;
            System.out.println("[!]Enter 'exit' to exit");
            System.out.print("Setool-Main//Main Console//Web Clone//Write The URL:");
            String target = input.nextLine() ;
            if (target.equals(exit)){
                web_clone.main_function();
                return ;
            }else{
                String encode  = "utf-8" ;
                String a = getHtmlResourceByUrl(target , encode) ;
                System.out.println(a);
                String content = a ;
                String name = "clone.html" ;
                setool.wirte_file(content , name);
                int port  = 8080 ;
                String page = "clone.html" ;
                String close = "no" ;
                port_start.port_server(port, page , close);
                web_clone.main_function();
                return ;
            }
        }if (options.equals(c3)){
            //use python3 clone
            System.out.println("[!]You can Input In The Terminal:python3 python_code/clone_website.py");
            String cmd = "python3 python_code/clone_website.py" ;
            exploit_social.shell1(cmd);
            web_clone.main_function();
            return ;
        }if (options.equals(c4)){
            //show all the project
            File file = new File("config/web_clone_options") ;
            setool.read_logo(file);
            web_clone.main_function();
        }
        if (options.equals(exit)){
            setool.run_main_function();
        }
        else{
            web_clone.main_function();
            return ;
        }
    }
    public static String getHtmlResourceByUrl(String url, String encoding) throws IOException , Exception {
        StringBuffer buffer=new StringBuffer();
        InputStreamReader isr=null;
        try {
            URL urlObj = new URL(url);
            URLConnection uc = urlObj.openConnection();
            isr =new InputStreamReader(uc.getInputStream(),encoding);
            BufferedReader reader =new BufferedReader(isr);
            String line=null;
            while ((line=reader.readLine())!=null) {
                buffer.append(line+"\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
                try{
                if(null!=isr)isr.close();}
                catch(IOException e){
                    e.printStackTrace();
                }
        }
        return buffer.toString();
    }
}
