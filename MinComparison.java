import java.util.*;

public class MinComparison
{
    public static void main (String [] args)
    {
        int a, b, c, min;
        System.out.println("Enter the three number you want to compare:");
        Scanner scanner = new Scanner (System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();

        if(a < b)
        {
            if(a < c)
            {
                min = a;
            }

            else
            {
                min = c;
            }
        }
        else
        {
            if(b < c)
            {
                min = b;
            }
            else
            {
                min = c;
            }
        }

        System.out.println("The lowest number out of the three numbers is: "+min);

    }
}
