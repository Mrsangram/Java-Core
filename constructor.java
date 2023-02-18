//CONSTRUCTOR

class Rec{
    int height,width,area;

    Rec(int x, int y)
    {
        height =x;
        width = y;

    }

    void area()
    {
        area = height*width;

        System.out.println("Area of rectangel:"+area);
    }
}

class MainRect{
    public static void main(String args[])
    {
    
    Rec obj = new Rec(100,100);
    obj.area();
    }
}
