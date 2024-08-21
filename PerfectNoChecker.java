import java.util.*;

public class PerfectNoChecker
{
    public static void main(String [] args)
    {
        int n, sum = 0;
        System.out.print("Enter any number: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for(int i = 1;i < n; i++)
        {
            if(n % i == 0)
            {
                sum = sum + i;
            }
        }
        if(sum == n)
        {
            System.out.print("The given number is a perfect number.");
        }
        else
        {
            System.out.print("The given number is not a perfect number.");
        }
    }
}
