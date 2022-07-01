import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class log_server {
    public static void main(String[]args) 
    throws Exception
    {
        System.out.println(Get_Time());
        System.exit(0);
    }
    public static String log_print(String ClassInfo,String log , String Error) 
    throws Exception
    {
        File folder = new File(ClassInfo);
        if (!folder.exists() && !folder.isDirectory())
        {
            //if the folder is not exists then create
            folder.mkdirs();
        }
        String content = log;
        String name = Get_Now_Time_Hour()+".log";
        File_Write_Path(ClassInfo , content , name ,Error);
        return log;
    }
    public static void File_Write_Path(String ClassInfo , String content , String name , String Error)
    throws Exception
    {
        String Print_Content = "["+Get_Time()+"]"+content;
        Write(name, Print_Content , ClassInfo);
    }
    public static String Get_Now_Time_Hour()
    {
        Date date = new Date(); 
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy-HH");  
        String Now_Time = formatter.format(date);
        return Now_Time;  
    }
    public static String Get_Time() throws Exception
    {
        Date date = new Date(); 
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH-mm-SS");  
        String Get_Time = formatter.format(date);
        return Get_Time;  
    }
    public static void Write(String name , String str_log , String ClassInfo) throws Exception
    {
        try
        {
            String NewName = "./log_server/"+ ClassInfo + "/" + name ;
            FileWriter fw=new FileWriter(NewName,true);
            fw.write(str_log+"\n");
            fw.close();
        }
        catch(Exception e)
        {
         System.out.println("[Error]:"+e.toString());
        }
    }
}
