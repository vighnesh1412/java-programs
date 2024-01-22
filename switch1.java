import java.util.Scanner;
public class switch1 
{
    public static void main(String arg[])
    {
        int a,b,result=0;
        char c;

        System.out.println("enter + for addition,- for substraction,* for multiplication,/ for dividation");

        System.out.println("enter the value of a\n enter the value of b");

        Scanner s=new Scanner(System.in);

        c=s.next().charAt(0);

        a=s.nextInt();
        b=s.nextInt();

       switch(c)
       {
        case '+':
                 result=a+b;
        break;

        case '-':
                 result=a-b;
        break;

        case '*':
                 result=a*b;
        break;

        case '/':
                 result=a/b;
        break;

        default:
                System.out.println("plz enter valid symbol");
        return;
       }

       System.out.printf("%d %s %d=%d",a,b,result,c);




       



    }
    
}
