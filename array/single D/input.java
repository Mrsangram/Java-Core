//wap to inpute the data from user and print it;
import java.util.*;
class Inpute
{
    public static void main(String args[])
    {
        int arr[] = new int[5];

        int i;

    Scanner ob = new Scanner(System.in);

    System.out.println("Enter the data");

    for(i=0; i<=4; i++)
    {
        arr[i] = ob.nextInt();
    }

    System.out.println("Elements Value:");

       for(i=0; i<=4; i++)
       {
           System.out.println(arr[i]);
       }
    }
}