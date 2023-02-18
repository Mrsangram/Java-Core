//Print Matrix 

import java.util.*;

class Matrix2
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);

        int arr[][] = new int[3][3];

        int i,j;

        System.out.println("Enter The Elements");

        for(i=0; i<3; i++)
        {
            for(j=0; j<3; j++)
            {
                arr[i][j] = ob.nextInt();
            }
        }

        System.out.println("Enter Elements:");

        for(i=0; i<3; i++)
        {
            for(j=0; j<3; j++)
            {
                System.out.print(arr[i][j]+ "\t");
            }
            System.out.println("");
        }
        
    }
}