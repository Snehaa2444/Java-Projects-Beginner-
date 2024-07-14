import java.util.*;

public class ASCIIgenerator
{
    public static void main( String [] args)
    {
        char ch;
        System.out.print("Enter any character: ");
        Scanner scanner = new Scanner(System.in);
        ch = scanner.next().charAt(0);
        int a = ch;
        System.out.print("The ASCII value for the given character is: "+a);
    }
}
