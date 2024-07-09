import java.util.*;

public class TernaryComparison
{
    public static void main(String [] args)
    {
        int a, b, c;
        Scanner obj = new Scanner (System.in);
        System.out.println("Enter 3 numbers");
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();

        System.out.println("Highest number is:");
        int max= (a>b) ? ((a>c) ? a:c) : ((b>c) ? b:c);
        System.out.println(max);
    }
}
