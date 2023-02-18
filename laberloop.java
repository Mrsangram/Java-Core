//Labaleloop in java

class Labaleloop{

    public static void main(String args[])
    {
        int i,j;
        
        labale: for(i=1; i<=10; i++)
        {

            System.out.println(" ");

            if(i == 5)
            {
                break;
            }

            for(j=1; j<=5; j++)
            {
                System.out.print("*");
                if(j == i )
                {
                    continue labale;
                }
            }
        }
    }
}