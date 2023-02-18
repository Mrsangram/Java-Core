//Counstructor 2 wap to print cal 

class Counstructor2{

    int i,j;

    Counstructor2(int x, int y)
    {
        i= x;

        j= y;
    }

    void disp()
    {
        int sum;

        

        sum = i+j;

        System.out.println("Sum of two num:"+sum);
    }
}

class TestCounstructor2{

    public static void main(String args[])
    {
        Counstructor2 ob = new Counstructor2(100,200);

        ob.disp();
    }
}