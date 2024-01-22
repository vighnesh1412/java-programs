public class main 
{
  public int addnumbers(int a,int b)
  {
    int sum=a+b;
    return sum;
  }
  public static void main(String arg[])
  {
    int num1=25;
    int num2=34;

    main obj=new main();

    int result= obj.addnumbers(num1,num2);

    System.out.println("the sum is"+result);
  }

}
