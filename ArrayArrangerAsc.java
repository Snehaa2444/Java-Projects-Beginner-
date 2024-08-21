import java.util.*;

public class ArrayArrangerAsc
{
    public static void main(String [] args)
    {
        int n, temp, sum=0;
        int a[] = new int [5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter elements of the array:");
        for(int i = 0;i <5;i++)
        {
            a[i] = scan.nextInt();
        }

        for(int i = 0;i<5;i ++)
        {
            for(int j = i+1;j<5;j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("The sorted array is: ");
        for(int i =0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }
}
