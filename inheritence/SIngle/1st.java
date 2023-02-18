//Wap to print Add and Div in Inheritence

class A 
{
    int i,j;

    void getedata(int x ,int y)
    {
        i = x;

        j =y;
    }

    int Add()
    {

        System.out.println("Sum of two num:");

        return (i+j);
    }
}

class B extends A 
{
    int DIVISION()
    {
     
    System.out.println("Division of Two num:");

    return (i/j);
    }
}

class Test
{
    public static void main(String args[])
    {
        B obj = new B();
        
        int add,Division;

        obj.getedata(45,45);
        add = obj.Add();
        Division = obj.DIVISION();

        System.out.println(+add);
        System.out.println(+Division);

    }
}