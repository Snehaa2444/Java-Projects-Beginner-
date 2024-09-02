import java.util.*;

public class Tribonacci
{
    public static void main(String [] args)
    {
        int  n,sum;
        System.out.print("How many terms do you want in the Tribonacci Series? ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        System.out.print("0 1 2 ");
        int n1=0, n2=1, n3=2;
        for(int i=0;i<n;i++)
        {
            sum = n1 + n2 + n3;//3  6
            System.out.print(sum+" ");
            n1 = n2;
            n2 = n3;
            n3 = sum;
        }
    }
}
