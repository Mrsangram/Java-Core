class BufferStr1
{

    public static void main(String args[])
    {
        StringBuffer str = new StringBuffer("Sangram is A Hacker");
        System.out.println("\n\t Before Append:"+str);

        str.append(".com");

        System.out.println("\n\tAfter Append:"+str);

        str.insert(0,"I am Sangram.");
        System.out.println("\n\tAfter Insert:"+str);

    }
}