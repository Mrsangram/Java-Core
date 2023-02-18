//method voer loading 

class method
{
    int i,j,k;
    method(int x)
    {
        i= x;

        System.out.println("Frist in A");
    }
    method(int x,int y)
    {
        i = x;
        j= y;

        System.out.println("Second in B");
    }
    method(int x,int y ,int z)
    {
        i = x;
        j =y;
        k = z;
        System.out.println("3rd in C");
    }

    void disp()
    {
        int sum ;
        sum = i+j+k;

        System.out.println("Sum of Two num:"+sum);

    }
}

class method1
{
    public static void main(String args[])
    {
       method obj = new method(100,100,100);

        obj.disp();
    }
}