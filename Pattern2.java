import java.util.*;

public class Pattern2
{
    public static void main(String [] args) {
        int n;
        System.out.println("Which pattern do you want to print?" +
                "\n1.) Square (solid)"+
                "\n2.) Square");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        switch(choice)
        {
            case 1: for(int i=0;i<5;i++)
                {
                    for(int j=0;j<=5;j++)
                    {
                        System.out.print("  *");
                    }
                    System.out.print("\n");
                }
            break;
            case 2: for(int i=0;i<5;i++)
            {
                if(i==0 || i==4)
                {
                    for(int j=0;j<5;j++)
                    {
                        System.out.print("  *");
                    }
                    System.out.print("\n");
                }
                else
                {
                    System.out.print("  *"+"         "+"  *");
                    System.out.print("\n");
                }
            }
            break;
            default: System.out.println("Wrong choice!");
        }
    }
}
