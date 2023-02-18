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
    int Dev()
    {

        System.out.println("Sub class In B");

        return(x/y);
    }
}

class C extends A
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

        int Dev,add,mult;
        
        obj.getdate(5,6);
        
        add = obj.add();
        mult= obj.mult();
        Dev = obj.Dev();

        System.out.println(+add);
        System.out.println(+mult);
        System.out.println(+Dev);
    }
}