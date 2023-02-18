
//Display Num 

class AA
{
    int x = 10;

    void disp()
    {
        System.out.println("Super"+x);
    }
}

class BB extends AA
{
    int y =20;
    
    void disp()
    {
        System.out.println("Super"+x);
        System.out.println("Sub class"+y);
    }
}

class Test
{
    public static void main(String args[])
    {
        BB obj = new BB();
        
        obj.disp();
    }
}