//Continue

class Countue{

      public static void main(String args[])
      {
          int num;

          for(num=1; num<=100; num++)
          {

              if(num == 5)
              {
                  continue;
              }
              System.out.print(num);
              System.out.print(" ");
          }
          
      }
}