import java.util.*;

public class ArrayMaxFinder
{
    public static void main(String [] args) {
        int a[] = new int[5];
        int max = 0;
        System.out.println("Enter the elements of your Array: ");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
        {
            a[i]= scan.nextInt();
        }
        int max = a[i];
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
