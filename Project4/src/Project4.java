import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Project4{
    /**
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[]args) throws FileNotFoundException {

        File file = new File("C:\\Users\\91832\\Documents\\Java-Projects\\Project3\\Project3.1\\src\\output.txt");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        if(file.exists()){
            System.exit(0);
        }
        
        PrintWriter output = new PrintWriter(file);
        output.print("Hello "+str.substring(0, 1).toUpperCase()+str.substring(1));
        output.close();
        sc.close();
        
    }
}