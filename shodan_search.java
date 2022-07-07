import java.net.URL;
import java.util.*;
public class shodan_search {
    public static void main(String[]args) throws Exception{
        shodan_search.next();
        return ;
    }
    public static void next() throws Exception{
        shodan_search.shodansearch();
    } 
    public static void shodansearch() throws Exception{
        Scanner input = new Scanner(System.in) ;
        System.out.print("Setool-Main//Main Console//Shodan Search//Enter shodan Command:");
        String options = input.nextLine() ;
        String exit = new String("exit") ;
        if(options.equals(exit)){
            //qiut
            setool.run_main_function();
        }else{
            shodan_search.submit(options);
            input.close();
            return ;
        }
    }
    public static void submit(String options) throws Exception{
        /*
		if (java.awt.Desktop.isDesktopSupported()) {
			try {
				// make url
				java.net.URI uri = java.net.URI.create("https://www.shodan.io/search?query=" + options);
				java.awt.Desktop dp = java.awt.Desktop.getDesktop();
				if (dp.isSupported(java.awt.Desktop.Action.BROWSE)) {
					// start the url
					dp.browse(uri) ;
                    setool.run_main_function();
				}
 
			} catch (Exception e) {
				e.printStackTrace();
                setool.run_main_function();
			}
        */
        String URL = "https://www.shodan.io/search?query=" + options;
        System.out.println("You can Visit: "+ URL);
        function.start_webbrowser(URL);
        shodan_search.next();
	}
}
