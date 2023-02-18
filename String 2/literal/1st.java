
class Test
{
    public static void main(String args[])
    {
        String str1 = "Sangram";
        String str2 = new String("Hacker");

        char name[] = {'R','A','M','A','n'};

        String str3 = new String(name);
        String  str4 = new String(name,3,4);
        String str5 = new String(str4);

        System.out.println("\n\t 1st String"+str1);
        System.out.println("\n\t 2nd String"+str2);
        System.out.println("\n\t 3rd String"+str3);
        System.out.println("\n\t 4th String"+str4);
        System.out.println("\n\t 5th String"+str5);
        ///System.out.println("\n\t 6th String"+str1.length());

    }
}