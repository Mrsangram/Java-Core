//Inheritence 

class A
{
    int x,y;

    void getdate(int a,int b)
    {
        x= a;
        y= b;
    }

    int add()
    {
        System.out.println("Sup class Method");

        return(x+y);
    }
}

class B extends A
{
    int mult()
    {
        System.out.println("Sub class method");

        return (x*y);
    }
}

class Test
{
    public static void main(String args[])
    {
        B obj = new B();

        int add,mult;
        
        obj.getdate(5,6);
        
        add = obj.add();
        mult= obj.mult();

        System.out.println(+add);
        System.out.println(+mult);
    }
}