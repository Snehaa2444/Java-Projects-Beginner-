import java.util.*;

public class Pattern1
{
    public static void main(String [] args) {
        int n;
        System.out.println("Which pattern do you want to print?" +
                "\n1.) Right angle triangle (north-east)"+
                "\n2.) Right angle triangle (north-west)"+
                "\n3.) Right angle triangle (south-west)"+
                "\n4.) Right angle triangle (south-east)");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        switch(choice)
        {
            case 1: for(int i=0;i<5;i++)
                {
                    for(int j=0;j<=i;j++)
                    {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
            break;
            case 2: for(int i=0;i<5;i++)
            {
                for(int j=4;j>i;j--)
                {
                    System.out.print(" ");

                }
                for(int v=0;v<=i;v++)
                {
                    System.out.print("*");
                }
                System.out.print("\n");
                }
            break;
            case 3: for(int i=0;i<5;i++)
            {
                for (int j=0;j<i;j++)
                {
                    System.out.print(" ");
                }
                for(int j=5;j>i;j--)
                {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
            break;
            case 4: for(int i=0;i<5;i++)
             {
                for(int j=5;j>i;j--)
                {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
            break;
            default: System.out.println("Wrong choice!");
        }
    }
}
