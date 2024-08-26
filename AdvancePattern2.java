import java.util.*;

public class AdvancePattern2
{
    public static void main(String [] args)
    {
        System.out.println("Pattern 1:");
        for(int i=1;i<=5;i++)
        {
            for(int j=4;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=5;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\nPattern 2:");

        int count =1;
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(count+" ");
            }
            count++;
            System.out.println();
        }
        System.out.println("\nPattern 3:");

        for(int i=1;i<=5;i++)
        {
            for(int j=4;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--)
            {
                System.out.print(k);
            }
            for(int l=2;l<i+1;l++)
            {
                System.out.print(l);
            }
            System.out.println();
        }
        System.out.println("\nPattern 4:");

        for(int i=0;i<=3;i++)
        {

            for(int j=3;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("*");
            }
            for(int l=1;l<=i;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<=3;i++)
        {

            for(int j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=4;k>i;k--)
            {
                System.out.print("*");
            }
            for(int l=3;l>i;l--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
