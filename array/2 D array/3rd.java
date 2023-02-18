//Print Matrix2D  

import java.util.*;

class Matrix3
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);

        int arr[][] = new int[2][2];

        int i,j;

        System.out.println("Enter The Elements");

        for(i=0; i<2; i++)
        {
            for(j=0; j<2; j++)
            {
                arr[i][j] = ob.nextInt();
            }
        }

        System.out.println("Enter Elements:");

        for(i=0; i<2; i++)
        {
            for(j=0; j<2; j++)
            {
                System.out.print(arr[i][j]+ "\t");
            }
            System.out.println("");
        }
        
    }
}