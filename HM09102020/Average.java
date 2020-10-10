import java.util.Scanner;
import java.util.Random;
public class Average
{
    public static void RandAr(int[] arr)
    {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = rand.nextInt(15);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void LowerThanAverage (int[] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }

        sum = sum / arr.length;

        for (int i = 0; i < arr.length ; i++)
        {
            if(arr[i] < sum)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int x = sc.nextInt();
        int[] arr = new int[x];
        RandAr(arr);
        LowerThanAverage(arr);
    }
}