//Hararical Level Inheritence 

class One 
{
    int x = 10, y = 20;

    void Disp()
    {
        System.out.println("Method of Class One");

        System.out.println("Value of X:"+x);
        System.out.println("Value of Y:"+y);
    }
}

class Two extends One{
    void add()
    {
        System.out.println("Method Of Class Two");

        System.out.println("Add Two num:"+(x+y));
    }
}

class Three extends One{
    void multi()
    {
        System.out.println("Method of Class Three ");
        System.out.println("Multi of Two num:"+(x*y));
    }
}

class Hello extends One
{
    void Dis1()
    {
    System.out.println("Hello");
    }
}


class Test
{
    public static void main(String args[])
    {
        Two obj1= new Two();
        Three obj2= new Three();

        obj1.Disp();
        obj1.add();
        obj2.multi();
        
    }
}