
import java.util.*;

public class threaten {
    public static void main(String[]args) throws Exception
    {
        threaten_main();
    }
    public static void threaten_main()
    throws Exception
    {  
        /* input all the value */
        Scanner scanner =  new Scanner(System.in);
        try 
        {
            //title
            System.out.print("Enter the title: ");
            String title = scanner.nextLine();
            //text
            System.out.print("Enter the text: ");
            String text = scanner.nextLine();
            //name
            System.out.print("Enter the name: ");
            String name = scanner.nextLine();
            //email
            System.out.print("Enter the email: ");
            String email = scanner.nextLine();
            //phone
            System.out.print("Enter the phone: ");
            String phone = scanner.nextLine();
            //time
            System.out.print("Enter the time: ");
            String time = scanner.nextLine();
            //save name
            System.out.print("Enter the save name: ");
            String SaveName = scanner.nextLine();
            threaten_Make(title, text, name, email, phone, time , SaveName);
            setool.run_main_function();
        } 
        catch (Exception err)
        {
            System.out.println("Error: " + err.getMessage());
        }
        finally
        {
            scanner.close();
        }
    }
    public static void threaten_Make(
        String title,
        String text,
        String name,
        String email,
        String phone,
        String time,
        String Save_Name
    )
    throws Exception
    {
        //make a new threaten page
        //write title
        String file = Save_Name + ".html";
        String title_text = "<style>body{margin:20px;padding:20px}</style><meta name='viewport' content='width=device-width,initial-scale=1.0,user-scalable=0'><meta charset='utf-8' /><br /><br /><h1>" + title + "</h1>";
        function.Wirte_Path(file, title_text);
        //write text
        String text_text = "<br /><p>" + text + "</p><br />";
        function.Wirte_Path(file, text_text);
        //write name
        String name_text = "<p>Name: " + name + "</p>";
        function.Wirte_Path(file, name_text);
        //write email
        String email_text = "<p>Email: " + email + "</p>";
        function.Wirte_Path(file, email_text);
        //write phone
        String phone_text = "<p>Phone: " + phone + "</p>";
        function.Wirte_Path(file, phone_text);
        //write time
        String time_text = "<br /><p>Time: " + time + "</p>";
        function.Wirte_Path(file, time_text);
    }
}
