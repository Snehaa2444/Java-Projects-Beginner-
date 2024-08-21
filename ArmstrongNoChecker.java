import java.util.*;

public class ArmstrongNoChecker
{
    public static void main(String [] args)
    {
        int n,r,c,u,count =0, prod=1, sum = 0;

        System.out.print("Enter any number: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        c=n;
        u=n;
        do
        {
            n= n/10;
            count ++;
        }
        while(n!=0);
        for(int i =1; i<=count;i++)
        {
            r=c%10;
            c=c/10;
            for(int j =1; j<=count;j++ )
            {
                prod = prod * r;
            }
            sum = sum +prod;
            prod =1;

        }
        System.out.println("Sum: "+sum);
        if(sum == u)
        {
            System.out.print("Since the sum is equal to the number, Therefore this is an armstrong number!");
        }
        else
        {
            System.out.print("This is not an armstrong number");
        }
    }
}
