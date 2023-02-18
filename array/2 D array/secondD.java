
//wap to value from user and print ist as matrix

import java.util.*;

class SecDim
{
    public static void main(String args[])
    {
        int arr[][] = new int[3][3];
        int i,j;

        Scanner ob =new Scanner(System.in);
        System.out.println("Enter the value of Elements:");

        for(i=0; i<=3; i++)
        {
            for(j=0; j<3; j++)
            {
                arr[i][j] = ob.nextInt();
            }
        }

        System.out.println("Elements are \n");

        for(i=0; i<=3; i++)
        {
            for(j=0; j<=3; j++)
            {
             System.out.println("")
            }
        }
    }
}