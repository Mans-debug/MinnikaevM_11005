import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coordinates of the first vector");
        Vector2D first = new Vector2D(sc.nextDouble(), sc.nextDouble());

        System.out.println("Enter coordinates of the second vector");
        Vector2D second = new Vector2D(sc.nextDouble(), sc.nextDouble());

        first.sumOfVectors(second);
        first.subOfVectors(second);

        System.out.println("Enter a constant.");
        first.multOfVectors(sc.nextDouble());


    }
}
