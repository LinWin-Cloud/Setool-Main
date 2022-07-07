import java.net.*;

public class Get_SYS_info {
    public static void main(String[]args)
    {
        /* get system information */
        /* if use java run main function , then exit */
        System.exit(0);
    }
    public static void Main_Get() throws Exception
    { 
        /* first , write the log */
        try
        {
            String ClassInfo = "Setool_RUN";
            String log = "[GET_SYSINFO]Get system information";
            String Error = "false" ;
            log_server.log_print(ClassInfo, log, Error);
        }
        catch (Exception err)
        {
            System.out.println(err);
        }
        finally
        {
            //then get the system information
            /* print the info in the console */
            Thread.sleep(200);
            for (int i = 1 ; i <= 1 ; i++)
            {
                System.out.println("");
                System.out.println("==>ALL Information===>");
                System.out.println("");
            }
            //print this host's net information
            System.out.println("Host's NET information=>");
            System.out.println("");
            System.out.println("  [+]IP: "+Get_SYS_info.Get_IP());
            System.out.println("  [+]Hostname: "+Get_SYS_info.Get_HOST());
            Thread.sleep(200);
            for (int i = 1 ; i <= 1 ; i++)
            {
                //print this host's system information
                System.out.println("");
                System.out.println("Your System info=>");
                System.out.println("");
                System.out.println("  [+]OS: "+Get_SYS_info.Get_OS());
                System.out.println("  [+]Java Version: "+Get_SYS_info.Get_Java_Version());
                System.out.println("  [+]WorkPath: "+Get_SYS_info.Get_WorkPath());
                System.out.println("  [+]Users: "+Get_SYS_info.Get_Users());
                System.out.println("  [+]RAM: "+Get_SYS_info.Get_RAM());
                System.out.println("  [+]OS Arch: "+Get_SYS_info.OS_Arch());
                System.out.println("  [+]OS Version: "+Get_SYS_info.OS_Version());
                System.out.println("  [+]Users Home: "+Get_SYS_info.Get_Users_Home());
            }
            Thread.sleep(200);
            for (int i = 1 ; i <= 1 ; i++)
            {
                //print this host's disk information
                System.out.println("");
                System.out.println("Your Disk info=>");
                System.out.println("");
                System.out.println("  [+]Disk: "+Get_SYS_info.Get_Disk());
                System.out.println("  [+]Disk_Info: "+Get_SYS_info.Get_Disk_Info());
            }
            Thread.sleep(200);
            for (int i = 1 ; i <= 1 ; i++)
            {
                //other information
                System.out.println("");
                System.out.println("Other info=>");
                System.out.println("");
                System.out.println("  [+]File Separator: "+Get_SYS_info.Get_File_Separator());
                System.out.println("  [+]Line Separator: "+Get_SYS_info.Get_Line_Separator());
                System.out.println("  [+]Path Separator: "+Get_SYS_info.Get_Path_Separator());
                System.out.println("  [+]File Encoding: "+Get_SYS_info.Get_File_Encoding());
                System.out.println("  [+]System Temp: "+Get_SYS_info.Get_System_Temp());
            }
            System.out.println("");
        }
    }
    public static String Get_OS() throws Exception
    {
        //GET OS NAME
        String OS = System.getProperty("os.name");
        return OS;
    }
    public static String Get_IP() throws Exception
    {
        //GET IP ADDRESS
        InetAddress inetAddress = InetAddress.getLocalHost();
        String IP = inetAddress.getHostAddress();
        return IP;
    }
    public static String Get_HOST() throws Exception
    {
        //GET HOSTNAME
        InetAddress inetAddress = InetAddress.getLocalHost();
        String Host = inetAddress.getHostName();
        return Host;
    }
    public static String Get_Java_Version() 
    throws Exception
    {
        //GET JAVA VERSION
        String Java_Version = System.getProperty("java.version");
        return Java_Version;
    }
    public static String Get_WorkPath() 
    throws Exception
    {
        //GET WORKPATH
        String WorkPath = System.getProperty("user.dir"); 
        return WorkPath;
    }
    public static String Get_Users()
    throws Exception
    {
        //GET USERS
        String Users = System.getProperty("user.name");
        return Users;
    }
    public static String Get_RAM()
    throws Exception
    {
        //GET RAM
        String RAM = System.getenv("PROCESSOR_IDENTIFIER");
        return RAM;
    }
    public static String Get_Disk()
    throws Exception
    {
        //GET DISK
        String Disk = System.getenv("PROCESSOR_IDENTIFIER");
        return Disk;
    }
    public static String Get_Disk_Info()
    throws Exception
    {
        //GET DISK INFO
        String Disk_Info = System.getenv("PROCESSOR_IDENTIFIER");
        return Disk_Info;
    }
    public static String OS_Arch() throws Exception
    {
        //GET OS ARCH
        String OS_Arch = System.getProperty("os.arch");
        return OS_Arch;
    }
    public static String OS_Version() throws Exception
    {
        //GET OS VERSION
        String OS_Version = System.getProperty("os.version");
        return OS_Version;
    }
    public static String Get_File_Separator() throws Exception
    {
        //GET FILE SEPARATOR
        String File_Separator = System.getProperty("file.separator");
        return File_Separator;
    }
    public static String Get_Users_Home() throws Exception
    {
        //GET USERS HOME
        String Users_Home = System.getProperty("user.home");
        return Users_Home;
    }
    public static String Get_Line_Separator() throws Exception
    {
        //GET LINE SEPARATOR
        String Line_Separator = System.getProperty("line.separator");
        return Line_Separator;
    }
    public static String Get_Path_Separator() throws Exception
    {
        //GET PATH SEPARATOR
        String Path_Separator = System.getProperty("path.separator");
        return Path_Separator;
    }
    public static String Get_File_Encoding() throws Exception
    {
        //GET FILE ENCODING
        String File_Encoding = System.getProperty("file.encoding");
        return File_Encoding;
    }
    public static String Get_System_Temp() throws Exception
    {
        //GET SYSTEM TEMP
        String System_Temp = System.getProperty("java.io.tmpdir");
        return System_Temp;
    }
}
