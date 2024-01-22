import java.util.Scanner;
public class swap 
{
   public static void main(String arg[])
   {
    int x,y,t;
    System.out.println("enter the value of x");
    System.out.println("enter the value of y");

    Scanner s=new Scanner(System.in);
    x=s.nextInt();
    y=s.nextInt();

    System.out.println("before swapping number:"+x+""+y);

    t=x;
    x=y;
    y=t;

    System.out.println("after swapping number:"+x+""+y);
   }
}
