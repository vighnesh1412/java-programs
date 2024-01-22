public class overloading 
{
    public static void display(int a)
    {
    System.out.println("argument:"+a);
    }

    public static void display(int a, int b)
    {
        System.out.println("argument:"+a+ "and" +b);
    }
    public static void main(String args[])
    {
        display(45);
        display(45,6);
    }
}
