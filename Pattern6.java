import java.util.*;

public class Pattern6
{
    public static void main(String [] args) {

        System.out.println("Pattern 1:");
        for(char i='A';i<='E';i++)
        {
            for(char j='A';j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("\nPattern 2:");
        for(char i='E';i>='A';i--)
        {
            for(char j='A';j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("\nPattern 3:");
        for(char i='a';i<='e';i++)
        {
            for(char j='a';j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("\nPattern 4:");
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((j%2) == 0)
                {
                    System.out.print("B");
                }
                else
                {
                    System.out.print("A");
                }
            }
            System.out.println();
        }
        System.out.println("\nPattern 5:");
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2 == 0)
                {
                    System.out.print("A");
                }
                else
                {
                    System.out.print("B");
                }
            }
            System.out.println();
        }
    }
}
