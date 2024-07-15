import java.util.*;

public class Factorial
{
    public static void main( String [] args)
    {
        int n, f=1;
        System.out.print("Enter any number: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for(int i = 1; i<= n; i++)
        {
            f = i*f;
        }
        System.out.print("The factorial of the given number is: "+f);

    }
}
