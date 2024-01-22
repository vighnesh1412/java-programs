import java.util.Scanner;

class input
{
    public static void main(String arg[])
    {
        int a;
        System.out.println("enter the element");
        
        Scanner s=new Scanner(System.in);
         
        a=s.nextInt();

        if (a%2==0)
        {
            System.out.println( "number is even");
        }
        else
        {
            System.err.println( "number is odd");
        }
    
    }
}