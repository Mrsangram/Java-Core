//class

class cal
{
  int a,b;

  cal(int x)
  {
      a = x;
      
  }

  cal(int x,int y)
  {

      a= x;
      b= y;
  }

  void Dis()
  {

      System.out.println("Cube of x:"+(a*a*a));
      System.out.println("Sum of Two num:"+(a+b));
  }
}

class Main
{
    public static void mian(String  args[])
    {
        
        cal ob2 = new cal(30);
        cal ob3 = new cal(100,100);
        
        ob2.Dis();
        ob3.Dis();     
    }
}