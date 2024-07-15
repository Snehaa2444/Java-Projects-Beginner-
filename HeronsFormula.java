import java.util.*;

public class HeronsFormula
{
    public static void main( String [] args)
    {
        int a , b, c;
        float sp;
        float area;
        System.out.print("Enter the sides of the triangle: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
         sp = (a+b+c)/2;

         area = (float) Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
         System.out.print("The area of the triangle using Heron's Formula is: "+area);

    }
}
