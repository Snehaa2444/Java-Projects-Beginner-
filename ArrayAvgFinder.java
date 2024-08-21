import java.util.*;

public class ArrayAvgFinder
{
    public static void main(String [] args)
    {
        int n, avg, sum=0;
        int a[] = new int [5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter elements of the array:");
        for(int i = 0;i <5;i++)
        {
            a[i] = scan.nextInt();
        }

        for(int i = 0;i<5;i ++)
        {
            sum = sum +a[i];
        }
        avg = sum/5;
        System.out.println("The average of the given array is: "+avg);
    }
}
