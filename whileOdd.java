//1  odd num

//use while

import java.util.*;

class ODd{
    public static void main(String args[])
    {

        int i;

        System.out.println("Enter the value:");

        Scanner ob = new Scanner(System.in);

        i = ob.nextInt();

        System.out.println("Print odd Num");

        while(i>=1)
        {

            if(i%2 == 1)
            {
                System.out.println(+i);
            }

            i--;
        }
    }
}