class noargcons
{
    int i;

    private noargcons()
    {
         i=5;
    }

    public static void main(String arg[])
    {
        noargcons obj=new noargcons();
        System.out.println("the value of i:"+obj.i);
    }
}