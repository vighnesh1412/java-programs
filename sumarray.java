public class sumarray 
{
    public static void main(String arg[])
    {
        int [] numbers={5,6,5,68,8,9};
        int sum=0;

        for(int number:numbers)
        {
            sum +=number;
        }

        System.out.println("sum ="+sum);
    }
    
}
