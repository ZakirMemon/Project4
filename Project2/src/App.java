import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        System.out.println("You have entered:"+str);
        sc.close();
    }
}
