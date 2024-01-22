class constructer1
{
    private String name;

    constructer1()
    {
       System.out.println("constructer called:");
       name="vighnesh";
    }

    public static void main(String[] args) 
    {
        constructer1 obj=new constructer1();

        System.out.println("the name is "+ obj.name);
        
    }

}