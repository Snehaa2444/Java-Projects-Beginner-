import java.util.*;

public class DiamondPattern
{
    public static void main(String [] args)
    {
        System.out.println("Diamond pattern: ");
        for(int i=0;i<10;i++)
        {
            if(i<=4)
            {
                for(int j=4;j>i;j--)
                {
                    System.out.print(" ");
                }
                for(int k=0;k<=i;k++)
                {
                    System.out.print("* ");
                }
            }
            else
            {

               for(int j=4;j<i;j++)
               {
                   System.out.print(" ");
               }
               for(int k=9;k>i;k--)
               {
                   System.out.print("* ");
               }
            }
            System.out.print("\n");
        }
    }
}
