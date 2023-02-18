//IF___..........Statement

import java.util.Scanner;

class If{

    public static void main(String args[]){

        int Sallery;
        
        
        System.out.println("Enter you Sellary");
          
          Scanner ob  =new Scanner(System.in);

          Sallery = ob.nextInt();
          

         if(Sallery<=1000000)
        {
            System.out.println("NO Discount");
        }

        else
        {
            int b = (Sallery*10)/100;

            Sallery = Sallery+b;

            System.out.println("Discount this Sallery:"+Sallery);
        }
    }
}