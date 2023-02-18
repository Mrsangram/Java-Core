//paladrome num print

import java.util.*;

class Plrm{

    public static void main(String args[])
    {

        int num, rev,temp=0,i;

         

        System.out.println("Enter the Num:");

        Scanner ob = new Scanner(System.in);

        num = ob.nextInt();

        i = num;

        

       while(num>0)
        {

                rev = num%10;
                temp = num*10+rev;
                num= num/10;
        }

        if(i == temp)
        {
            System.out.println("This value is palndrome");
        }

        else
        {
            System.out.println("This value is not plandrome");
        }
    }
}