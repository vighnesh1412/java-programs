public class arrsum 
{
    public static void main(String arg[])
    {
        int [] a = {4,5,6,8,9};
         int sum=0;

        for(int number:a){

            sum+=number;
        }
        System.out.println("Sum = " + sum);
    }
    
}
