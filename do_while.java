//do-while loop

class Do_while{

    public static void main(String agrs[])
    {

        System.out.println("This is 1 to 100 Even Num:");

        int i=2;
 
        do
        {

            if(i%2==0)
            {
                System.out.print(+i);
                
            }
            

            System.out.print(" ");
            i++;
        }
        while(i<=100);
    }
}