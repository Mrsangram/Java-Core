//Multi Level Inheritence 

class Student
{
    int roll;

    void getedata(int x)
    {
        roll = x;
    }

    void PutRoll()
    {
        System.out.println("Roll Num:"+roll);
    }
}

class Test extends Student
{
    int m1,m2;
    

    void geteMark(int x, int y)
    {
        m1 = x; 

        m2 = y;
    }

    void PutMark()
    {
        System.out.println("Test M1:"+m1+" And M2:"+m2);
    }
}

class Result extends Test{

    int total;

    void disp()
    {
        PutRoll();
        PutMark();

        total= m1+m2;
        
        System.out.println("Total Mark OF Test:"+total);
    }
}


class Main
{
    public static void main(String args[])
    {
        Result obj = new Result();
        obj.getedata(803);
        obj.geteMark(80,90);

        obj.disp();
    }
}