//Wap to count how many odd and even no in the array

import java.util.*;

class Odd_even
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);

        int arr[] = new int[10];

        int i,odd=0,even=0;

        System.out.println("Enter the Num:");

        for(i=0; i<9; i++)
        {
            arr[i]= ob.nextInt();
        
        }

        for(i=0; i<=9; i++)
        {
            if(arr[i]%2==0)
            {
                System.out.println("This is Even num:"+arr[i]);
            }

            else
            {
                System.out.println("This is Odd Value:"+arr[i]);
            }
        }
    }
}