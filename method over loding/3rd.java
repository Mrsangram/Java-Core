//Calculet of two num using constructor

class Test
{
    int a,b;
    
    Test(int x)
    {
        a= x;

        System.out.print("Squar is"+(a*a));
    }


    Test(int x,int y)
    {
        a= x; 
        b= y;

        System.out.println("Sum of two num"+(a+b));
    }
    
    
}


class Main
{
    public static void Main(String args[])
    {
        Test obj = new Test();
        obj.Test(100);
        obj.Test(100,100);
    }
}