//Nestaed Exceptions

class Test
{
    public static void main(String args[])
    {
        int a,b,ans;
        
        try{

            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);

            try{

                ans = (a/b);

                System.out.println("Result:"+ans);
            }

            catch(ArithmeticException e)
            {
                System.out.println("Devision By Zero");
            }
        }

        catch(NumberFormatException e)
        {
            System.out.println("Incorrect Argument Type");
        }
    }
}