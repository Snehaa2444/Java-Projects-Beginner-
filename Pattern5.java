import java.util.*;

public class Pattern5
{
    public static void main(String [] args) {

        System.out.println("Pattern 1:");
        for(int i=1;i<5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("Pattern 2:");
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("Pattern 3:");
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((j%2) == 0)
                {
                    System.out.print("0");
                }
                else
                {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
        System.out.println("Pattern 4:");
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2 == 0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
