import java.util.*;

public class ArrayMaxFinder
{
    public static void main(String [] args) {
        int[] a = new int[5];
        int max;
        System.out.println("Enter the elements of your Array: ");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
        {
            a[i]= scan.nextInt();
        }
        max = a[0];
        for (int i =0; i<5 ;i++)
        {
            if(a[i]>max)
                {
                    max = a[i];
                }
        }
        System.out.println("The maximum number in the given Array is "+max);
    }
}
