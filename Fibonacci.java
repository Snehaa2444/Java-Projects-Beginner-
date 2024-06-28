import java.util.Scanner;

public class Fibonacci
{
    public static void main (String [] args)
    {
        int n;
        int i=0;
        int j=1;
        int k;
        System.out.println("Enter terms the no. of terms you want in the Fibonacci Sequence");
        Scanner scanner = new Scanner (System.in);
        n = scanner.nextInt();
        for(int a=1; a<n+1; a++)
        {
            System.out.print(i+" ");
            k=i+j;
            i=j;
            j=k;
        }
    }
}
