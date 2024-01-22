import java.util.Scanner;

public class swap2 
{
    public static void main(String arg [])
    {
        int a,b,t;
        System.out.println("enter the value of a\n enter the value of b");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();

        System.out.println("value before swapping"+a+""+b);

        t=a;
        a=b;
        t=b;

        System.out.println("value after swapping"+a+""+b);
    }
    
}
