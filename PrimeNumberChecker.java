import java.util.*;

public class PrimeNumberChecker
{
    public static void main(String [] args)
    {
        int n;
        int count = 0;
        System.out.print("Enter any Number: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        if(n <= 2)
        {
            System.out.print("The given number is a prime number.");
        }
        else
        {
            for(int i =2;i <= n-1;i++)
            {
                if(n%i == 0)
                {
                    count = 1;
                }
                else
                {
                    count = 0;
                }
            }
            if(count == 1)
            {
                System.out.print("The given number is not a prime number");
            }
            else
            {
                System.out.print("The given number is a prime number");
            }
        }
    }
}v
