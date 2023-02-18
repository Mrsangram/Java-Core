//wap to print the value oftermulti 2 in each value;
import java.util.*;

class MutliA
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

        for(i=0; i<5; i++)
        {
        System.out.println("Elementes:"+arr[i]+"*2:");
        }
        for(i=0; i<5; i++)
        {
            arr[i] = arr[i]*2;

            System.out.println(arr[i]);
        }
    }
}