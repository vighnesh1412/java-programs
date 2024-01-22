import java.util.Scanner;
public class largest3 
{
    public static void main(String arg[])
    {
        int a,b,c;
        System.out.println("enter the value of a");
        System.out.println("enter the value of b");
        System.out.println("enter the value of c");

        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();

        if(a>=b && a>=c)
        {
            System.out.println("a is greater");
        }
        else if(b>=a && b>=c)
        {
            System.out.println("b is greater");
        }
        else
        {
            System.out.println("c is greater");
        }
    }
    
}
