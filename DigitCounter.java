import java.util.*;

public class DigitCounter
{
    public static void main( String [] args)
    {
        int n, count = 0;
        System.out.print("Enter any number: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        while(n!=0)
        {
            n=n/10;
            count ++;
        }
        System.out.print("The number has "+count+" digits");
    }
}
