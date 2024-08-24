import java.util.*;

public class Pattern7
{
    public static void main(String [] args) {

        System.out.println("Pattern 1:");
        int count1 = 0;
        for(char i=1;i<=5;i++)
        {
            for(char j=1;j<=i;j++)
            {
                count1++;
                System.out.print(count1+" ");
            }
            System.out.println();
        }
        System.out.println("\nPattern 2:");
        char count2 = 'A';
        for(char i='A';i<='E';i++)
        {
            for(char j='A';j<=i;j++)
            {
                System.out.print(count2+" ");
                count2 ++;
            }
            System.out.println();
        }
    }
}
