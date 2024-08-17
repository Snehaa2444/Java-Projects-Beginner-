import java.util.*;

public class PalindromeChecker
{
    public static void main(String [] args)
    {
        int n , c, r, sum = 0;
        System.out.print("Enter any number ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        c = n;
        while(n != 0)
        {
            r = n%10;
            sum = (sum*10) +r;
            n = n/10;
        }
        if(c == sum)
        {
            System.out.print("The given number is a palindrome");
        }
        else
        {
            System.out.print("The given number is not a palindrome");
        }
    }
}
