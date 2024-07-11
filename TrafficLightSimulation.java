import java.util.*;

public class TrafficLightSimulation
{
    public static void main (String [] args)
    {
        System.out.println("**** Traffic Light Simulator ****");
        System.out.println("What is the color of the traffic light?");
        Scanner scanner = new Scanner(System.in);
        String color = scanner.next();
        color = color.toLowerCase();

        if (color.equals("red"))
        {
            System.out.println("Stop");
        }
        else if (color.equals("yellow"))
        {
            System.out.println("Wait");
        }
        else if(color.equals("green"))
        {
            System.out.println("Go!");
        }
        else
        {
            System.out.println("This is not a color of the traffic light");
        }
    }
}
