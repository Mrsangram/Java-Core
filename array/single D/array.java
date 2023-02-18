//wap to print the value ofter ineremuting 1 in each value;
import java.util.*;

class Array
{
    public static void main(String agrs[])
    {
        int arr[] = new int[5];

        int i;

        Scanner ob = new Scanner(System.in);

        System.out.println("Enter Input value:");

        for(i=0; i<5; i++)
        {
        
           arr[i] = ob.nextInt();

           
        }

        System.out.println("Elementes:");

        for(i=0; i<5; i++)
        {

           System.out.println(arr[i]); 
        }

        for(i=0; i<5; i++)
        {
            arr[i] = arr[i]+1;

            System.out.print(arr[i]);
        }
    }
}