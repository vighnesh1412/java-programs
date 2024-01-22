public class this2
{
    int age;

    this2( int age)
    {
       this.age=age;
      
    }

    public static void main(String arg[])
    {
        this2 obj=new this2(8);
        System.out.println("obj.age="+obj.age);
    }
}
