import Pack1.Test;
class Sub extends Test
{
    int n =200;
    void dispSub()
    {
        System.out.println("Sub Class");
        System.out.println("Val="+val);
        System.out.println("N ="+n);
    }
}

class Main
{
    public static void main(String args[])
    {
        Sub obj = new Sub();
        obj.disp();
        obj.dispSub();
    }
}