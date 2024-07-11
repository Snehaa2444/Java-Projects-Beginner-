import java.util.*;

public class MinTernaryComparison
{
    public static void main (String [] args)
    {
        int a, b, c;
        System.out.println("Enter the three number you want to compare:");
        Scanner scanner = new Scanner (System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();

        int min= (a<b) ? (a<c ? a:c) : (b<c ? b:c);

        System.out.println("The lowest number out of the three numbers is: "+min);

    }
}
