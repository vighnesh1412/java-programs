import java.util.Scanner;
public class arth 
{
    public static void main(String arg[])
    {
        int a,b;
        System.out.println("enter the value of a");
        System.out.println("enter the value of b");
         
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();

        System.out.println("a+b="+(a+b)); //addition

        System.out.println("a-b="+(a-b)); //substraction

        System.out.println("a*b="+(a*b)); //multiplication

        System.out.println("a/b="+(a/b)); //divide

        System.out.println("a%b="+(a%b)); //mode
    }
    
}
