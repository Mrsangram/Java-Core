class A extends Thread
{
    public void run()
    {
        for(int i=1; i<5; i++)
        {
            System.out.println("From A"+i);
        }

          System.out.println("Exit A");
    }
}
class B extends Thread
{
    public void run()
    {
        for(int i=1; i<5; i++)
        {
            System.out.println("From B"+i);
        }

          System.out.println("Exit B");
    }
}
class Test
{
    public static void main(String args[])
    {
        A obja = new A();
        B objb = new B();

        obja.sleep(100);
        objb.sleep(500);
    }
}