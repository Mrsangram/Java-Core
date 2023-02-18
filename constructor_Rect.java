//wap to print Rectangel area

class Rectangel{

    int i,j;

    Rectangel(int x,int y)
    {
       i= x;
       j= y;
    }

    void disp()
    {
        float Rec;
       
        Rec = i*j;

        System.out.println("Rectangle :"+Rec);
    }
}

class TestRec
{
    public static void main(String args[])
    {
       Rectangel obj = new Rectangel(100,100);

        obj.disp();
    }
}