import java.util.*;

public class QRcode 
{
    public static void main(String[]args) throws Exception
    {
        System.out.println("[!]Enter 'exit' to exit") ;
        QRcode.Make_QRcode();
    }
    public static void Make_QRcode() throws Exception
    {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter The URL: ");
        String url = scanner.nextLine();
        try
        {
            String ClassInfo = "Setool_RUN";
            String log = "[QRcode] Input OPtions: " + url;
            String Error = "false" ;
            log_server.log_print(ClassInfo, log, Error);
        }
        catch (Exception err)
        {
            System.out.println(err);
        }
        if (url.equals("exit"))
        {
            //goto the main console
            setool.run_main_function();
        }
        else
        {
            //use python code to make qrcode
            //use function
            System.out.println("Save QRcode: /QRcode");
            String content = url ;
            String name = "QRconfig.txt";
            setool.wirte_file(content, name);
            String Py_Name = "Make_QRcode.py";
            function.Run_Python(Py_Name);
            Make_QRcode();
            scanner.close(); 
        }
    }
}
