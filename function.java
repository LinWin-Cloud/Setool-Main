import java.io.File;
import java.nio.file.Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;  
import java.io.InputStreamReader; 
public class function 
{
    public static void CopyFiles(File resources , File target) 
    throws Exception
    {
        //copy the file from the resources to the target
        try
        {
            Files.copy(resources.toPath(), target.toPath());
        }
        catch(Exception e)
        {
            /* print the log to the log file */
            String ClassInfo = "function_using";
            String log = "Used Function Copyfiles";
            String error = e.toString() ;
            log_server.log_print(ClassInfo, log, error);
            System.out.println("[!]Error: " + e);
        }
    }
    public static void System_command(String command) throws Exception
    {
        //use system shell to run the command
        String ClassInfo = "function_using";
        String log = "Used System_command";
        try
        {
            Runtime.getRuntime().exec(command);
            String error = "true" ;
            log_server.log_print(ClassInfo, log, error);
        }
        catch(Exception e)
        {
            String error = e.toString();
            log_server.log_print(ClassInfo, log, error);
            System.out.println("[!]Error: " + e);
        }
    }
    public static void FileRead(File file)
    {
        /* first , write the log */
        String ClassInfo = "function_using" ;
        String log = "Used FileRead";
        try
        {
            String error = "true" ;
            log_server.log_print(ClassInfo, log, error);
        }
        catch (Exception ERR)
        {
            System.out.println(ERR);
        }
        //read the file form the target file
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while((line = br.readLine()) != null)
            {
                System.out.println(line);
            }
            br.close();
        }
        catch(Exception e)
        {
            System.out.println("[!]Error: " + e);
        }
    }
    public static void LinuxFileCopy(File resources, File target) throws Exception
    {
        //copy the file from the source to the target (use linux shell)
        String cmd = "cp " + resources + " " + target;
        String execution = cmd;  
        Process process = null;
        BufferedReader input = null;
        String user = "";

        /* log */
        String ClassInfo = "function_using";
        String log = "Used Function:LinuxFileCopy";
        try
        {
            /* write the log */
            try
            {
                String error = "true" ;
                log_server.log_print(ClassInfo, log, error);
            }
            catch (Exception err)
            {
                System.out.println(err);
            }
            process = Runtime.getRuntime().exec(execution);
            process.waitFor();
            int result = process.exitValue();     
            input = new BufferedReader(new InputStreamReader(process.getInputStream()));
            user = input.readLine();    
            if (result == 1){
                System.out.println("[!]Error: " + user);
            }
            else{
                System.out.println("[+]Success: " + user);
            }
        }
        catch (Exception e) 
        {
            String error = e.toString();
            log_server.log_print(ClassInfo, log, error);
        }
        finally
        {
            //other optionings
        }
    }
    public static void start_webbrowser(String URL) 
    throws Exception
    {
        py_start_webbrowser(URL);
    }
    public static void py_start_webbrowser(String URL) throws Exception
    {
        /* The log info */
        String ClassInfo = "function_using";
        String log = "Used Function:py_start_webbrowser";
        try
        {
            String error = "true" ;
            log_server.log_print(ClassInfo, log, error);
        }
        catch (Exception err)
        {
            System.out.println(err);
        }
        try
        {
            String FilePath = "./URL_cfg.txt";
            File file = new File(FilePath);
            file.delete();
            if (!file.exists())
            {
                //the file is not exists
                file.createNewFile();
                String content = URL;
                String name = FilePath;
                setool.wirte_file(content, name);
            }
            String command = "python3 python_code/start_webbrowser.py";
            System_command(command);   
        }
        catch (Exception err)
        {
            System.out.println(err); //print the error information
            String error = err.toString();
            log_server.log_print(ClassInfo, log, error);
        }
    }
    public static void LinuxWirteFile(String Path , String Content)
    {
        String command = "echo "+Content+" > "+Path;
        exploit_social.shell1(command);
    }
    public static void Python_WriteFile() throws Exception {
        try {
            //... ...
        } catch (Exception error) {
            /* print the error log to the file */
            System.out.println(error);
            String ClassInfo = "function_using";
            String log = "Use Function: Python_WriteFile";
            String err = error.toString();
            log_server.log_print(ClassInfo, log, err);
        }
    }
    public static void Run_Python(String Py_Name) throws Exception
    {
        //use shell method
        /* first , write the log */
        try
        {
            String ClassInfo = "function_using" ;
            String log = "Use Function:Run_Python";
            String error = "false" ;
            log_server.log_print(ClassInfo , log , error);
        }
        catch (Exception ERR)
        {
            System.out.println(ERR);
        }
        try
        {
            String run = "python3 ./python_code/"+Py_Name;
            exploit_social.shell1(run);
        }
        catch (Exception err)
        {
            System.out.println(err);
            String ClassInfo = "function_using" ;
            String log = "Use Function:Run_Python";
            String error = err.toString();
            log_server.log_print(ClassInfo , log , error);
        }
    }
    public static String Reture_Read(String in_file) throws Exception
    {  
        try (//read the file and return the content
        BufferedReader reader = new BufferedReader(new FileReader(in_file))) {
            String line;
            while((line = reader.readLine()) != null)
            {
                return line;
            }
            reader.close();
            return line;
        }
    }
    public static void Wirte_Path(String str,String content) throws Exception
    {
        try
        {
            String NewName = str;
            FileWriter fw=new FileWriter(NewName,true);
            fw.write(content);
            fw.close();
        }
        catch(Exception e)
        {
            System.out.println("[Error]:"+e.toString());
        }
    }
}
