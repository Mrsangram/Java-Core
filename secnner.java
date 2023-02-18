//seccaner


import java.util.Scanner;

class Secnner{
    public static void main(String args[])
    {
        int num;

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a Num:");

        num  = obj.nextInt();

        System.out.println("Square is Num:"+(num*num));
    }
}