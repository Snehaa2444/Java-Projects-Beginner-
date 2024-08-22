import java.util.*;

public class ArrayMinFinder
{
    public static void main(String [] args) {
        int a[] = new int[5];
        System.out.println("Enter the elements of your Array: ");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
        {
            a[i]= scan.nextInt();
        }
        int min = a[0];
        for (int i =0; i<5 ;i++)
        {
                if(a[i]<min)
                {
                    min = a[i];
                }
        }
        System.out.println("The minimum number in the given Array is "+min);
    }
}
