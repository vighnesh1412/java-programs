import java.util.Scanner;
public class if1 
{
    public static void main(String arg[])
    {
        int a;

        System.out.println("enter the value of a");

        Scanner s = new Scanner(System.in);
        {
            a=s.nextInt();
        }
        if(a%2==0)
        {
            System.out.println("the number is even");
        }

        System.out.println("the number is odd");

    }
    
}
