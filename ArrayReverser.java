import java.util.*;

public class ArrayReverser
{
    public static void main(String [] args)
    {
        int size,i;
        System.out.println("Enter size of Array:");
        Scanner scan = new Scanner(System.in);
        size = scan.nextInt();
        int a [] = new int [size];
        System.out.println("Enter the elements of Array:");

        for(i = 0; i<size; i++)
        {
            a[i] = scan.nextInt();
        }
        System.out.println(("Array in Reverse order is: "));
        for(i = size-1;i >=0;i--)
        {
            System.out.println(a[i]);
        }
    }
}
