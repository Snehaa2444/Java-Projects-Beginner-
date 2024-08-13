import java.util.*;

public class DigitSumFinder
{
    public static void main(String [] args)
    {
        int n;
        int sum = 0;
        System.out.print("Enter any number: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.print("The sum of the digits of the given number is: ");
        do
        {
            sum += (n%10);
            n = n/10;

        }
        while(n != 0);
        System.out.print(sum);
    }
}
