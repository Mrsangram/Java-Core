//multipal class Using in java


class Test
{
    int a,b,c;

    void getdata(int x,int y)
    {

        a= x;

        b= y;
    }

    void add()
    {

        c = a+b;

        System.out.println("Add this num:"+c);
    }
}

class Main{

    public static void main(String args[])
    {
        Test ob = new Test();
        ob.getdata(100,200);

        ob.add();
    }
}
