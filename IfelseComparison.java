import java.util.*;

public class IfelseComparison
{
    public static void main(String [] args)
    {
        int a, b, c, max=0;
        System.out.println("Enter any three numbers");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if(a > b)
        {
            if(a > c)
            {
                max = a;
            }
            else
            {
                max = c;
            }
        }
        else if (b > a)
        {
            if (b > c)
            {
                max = b;
            }
            else
            {
                max = c;
            }
        }
        System.out.println("The maximum number out of the three numbers is "+ max);
    }
}
