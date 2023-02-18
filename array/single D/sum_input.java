//wap to print sum of all elements of the array

import java.util.*;


class A
{
    public static void main(String args[])
    {
        int arr[] = new int[10];

        int i,sum=0;
        

        Scanner ob = new Scanner(System.in);

        System.out.println("Enter the data");

        for(i=0; i<=9; i++)
        {
            arr[i] = ob.nextInt();
        }

        for(i=0; i<=9; i++)
        {
            System.out.println(arr[i]);
        }

        for(i=0; i<=9; i++)
        {
            sum = sum+arr[i];
        }
        System.out.println("Sum of array:"+sum);
    }
}