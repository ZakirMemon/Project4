import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteIntoFile{
    /**
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[]args) throws FileNotFoundException {

        File file = new File("C:\\Users\\91832\\Documents\\Java-Projects\\Project3\\Project3.1\\src\\output.txt");
        if(file.exists()){
            System.exit(0);
        }
        
        PrintWriter output = new PrintWriter(file);
        output.print("Zakir Memon");
        output.close();
        
    }
}