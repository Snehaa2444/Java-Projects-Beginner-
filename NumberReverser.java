import java.util.Scanner;

public class NumberReverser
{
    public static void main(String []args)
    {
        int rim = 0;
        int n;
        System.out.print("Enter the number you want to reverse: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.print("The reverse of the number is: ");
        while(n !=0)
        {
            rim = n%10;
            System.out.print(rim);
            n = n/10;
        }

    }
}
