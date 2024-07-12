import java.util.*;

public class QuadEqSolver
{
    public static void main(String [] args)
    {
        int a;
        int b;
        int c;
        int x1, x2, sq;

        System.out.println("Enter the coefficients");
        System.out.println("coeff. of x^2: ");
        Scanner scanner = new Scanner(System.in);
        a=scanner.nextInt();
        System.out.println("coeff. of x: ");
        b=scanner.nextInt();
        System.out.println("constant: ");
        c=scanner.nextInt();

        int D = (b*b) - 4*a*c;
        sq = (int) Math.sqrt(D);
        System.out.println("The value of D is: "+D);
        if(D>0)
        {
            x1= (-b + (sq))/(2*a);
            x2= (-b - (sq))/(2*a);
            System.out.println("The equation has two distinct roots that are: "+x1+" and "+x2);
        }
        else if(D == 0)
        {
            x1 = -b/(2*a);
            System.out.println("The equation has one repeating root that is: "+x1);
        }
        else
        {
            System.out.println("The equation has no real roots");

        }
    }
}
