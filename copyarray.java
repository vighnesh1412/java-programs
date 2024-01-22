public class copyarray 
{
    public static void main(String arg[])
    {
        int [] numbers={2,3,6,8,7,6};
        int [] positivenumber = numbers;

        for( int number:positivenumber)
        {
            System.out.println(number+" ");
        }
    }
    
}
