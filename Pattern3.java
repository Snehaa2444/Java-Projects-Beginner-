import java.util.*;

public class Pattern3
{
    public static void main(String [] args) 
    {
        int n;
        System.out.println("Which pattern do you want to print?" +
                "\n1.) Pyramid (upright)"+
                "\n2.) Pyramid (inverted)");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        switch(choice)
        {
            case 1: for(int i=1;i<=5;i++)
                {
                    for(int j=5;j>i;j--)
                    {
                        System.out.print(" ");
                    }
                    for(int k=1;k<=i;k++)
                    {
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }
            break;
            case 2: for(int i=1;i<=5;i++)
            {
                for(int j=1;j<i;j++)
                    {
                        System.out.print("  ");
                    }
                for(int k=5;k>=i;k--)
                    {
                        System.out.print("  * ");
                    }
                System.out.print("\n");
            }
            break;
            default: System.out.println("Wrong choice!");
        }
    }
}
