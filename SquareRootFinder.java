import java.util.*;

public class SquareRootFinder
{
    public static void main(String [] args)
    {
        int n;
        System.out.print("Enter any number: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        double m = Math.sqrt(n);
        System.out.print("The square root of the given number is :"+m);
    }
}
