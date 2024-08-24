import java.util.*;

public class Pattern4
{
    public static void main(String [] args)
    {
        System.out.println("What do you want to print?"+
                "\n1.) Half Left Diamond"+
                "\n2.) Half Right Diamond");
        Scanner scan =  new Scanner(System.in);
        int choice = scan.nextInt();
        switch (choice)
        {
            case 1: for(int i=0;i<9;i++)
            {
                if(i<=4)
                {
                    for(int j=0; j<=i;j++)
                    {
                        System.out.print("* ");
                    }
                }
                else
                {
                    for(int j=9;j>i;j--)
                    {
                        System.out.print("* ");
                    }
                }
                System.out.print("\n");
            }
            break;
            case 2: for(int i=0;i<9;i++)
            {
                if(i<=4) {
                    for (int j = 4; j > i; j--) {
                        System.out.print(" ");

                    }
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                }
                else
                {
                    for (int j = 0; j < i-4; j++)
                    {
                        System.out.print(" ");
                    }
                    for (int j = 9; j > i; j--)
                    {
                        System.out.print("*");
                    }
                }
                System.out.print("\n");

            }

        }

    }
}
