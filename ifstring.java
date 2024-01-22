import java.util.Scanner;
public class ifstring 
{
    public static void main(String arg[])
    {
        String language;

        System.out.println("enter the language");

        Scanner s=new Scanner(System.in);
        language=s.nextLine();

        if(language=="java")
        {
           System.out.println("programming lang");
        }

        System.out.println("not programming best language");
    }
    
}
