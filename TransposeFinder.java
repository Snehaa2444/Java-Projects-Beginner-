import java.util.*;

public class TransposeFinder
{
    public static void main(String [] args)
    {
        int r, c;
        Scanner scan = new Scanner(System.in);
        System.out.print("How many rows do you want in your metrics? ");
        r = scan.nextInt();
        System.out.print("How many columns do you want in your metrics? ");
        c = scan.nextInt();
        int a1[][] = new int [r][c];
        int a3[][] = new int [r][c];

        System.out.println("Enter the elements of the metrics :");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a1[i][j] = scan.nextInt();
            }
        }
        System.out.println("Your metrics is: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a1[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("The transpose of the metrics is: ");
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                a3[i][j]= a1[j][i];
                System.out.print(a3[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
