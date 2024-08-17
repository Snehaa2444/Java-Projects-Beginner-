import java.util.*;

public class PrimeNoFinder
{
    public static void main(String [] args)
    {
        int n, m, i, j;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any Number 1: ");
        n = scanner.nextInt();
        System.out.print("Enter any Number 2: ");
        m = scanner.nextInt();
        System.out.print("The prime numbers between the given numbers are:");
        for(i = n;i <= m;i++)
        { for(j =2;j <= i;j++)
            {
                if (i % j == 0)
                {
                    break;
                }
            }
            if(i == j)
            {
                System.out.print(j+" ");
            }
        }
    }
}
