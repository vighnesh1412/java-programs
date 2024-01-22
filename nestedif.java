import java.util.Scanner;
public class nestedif 
{
    public static void main(String arg[])
    {
        int a,b,c;
        System.out.print("enter the value of a\n enter the value of b\n enter the value of c");

        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();

        if(a>=b)
        {
            if(a>=c)
            {
                System.out.println("a is greater");
            }
            else
            {
            System.out.println("c is greater");
            }
        }
        else
        {
            if(b>=c)
            {
                System.out.print("b is greater");
            }
            else
            {
                System.out.print("c is greater");
            }
        }
    }
    
}
