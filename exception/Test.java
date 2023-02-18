class Test
{
    public static void main(String args[])
    {
        int valid=0, invalid=0;
        int no;

        for(int i=0; i<args.length; i++)
        {
            try{
                no = Integer.parseInt(args[i]);
            } 

            catch(NumberFormatException e)
            {
                invalid = invalid+1;

                System.out.println("Invalid Number"+args[i]);

                continue;
            }
            valid = valid+1;
        }
        System.out.println("valid Numbers"+valid);
        System.out.println("Invalid Numbers"+invalid);
        
    }
}