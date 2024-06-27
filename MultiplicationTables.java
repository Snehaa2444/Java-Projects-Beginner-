public class MultiplicationTables
{
    public static void main (String [] args)
    {
        int i;
        int j;
        System.out.println("Tables from 2 to 20");
        for(i=2;i<20;i++)
        {
            System.out.println("Table of "+i);
            for(j=1;j<11;j++)
            {
                System.out.println(i+" * "+j+" = "+i*j);
            }
            System.out.println("\n");
        }
    }
}
