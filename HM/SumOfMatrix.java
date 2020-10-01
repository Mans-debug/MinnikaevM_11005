//сложение матриц
import java.util.Scanner;
import java.util.Random;
public class SumOfMatrix
{
    public static void main(String[] args)
    {
        int x = 2;//размеры матриц
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in the size of a matrix.");
        x = sc.nextInt();
        int[][] a = new int[x][x];
        int[][] b = new int[x][x];

        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a.length;j++)
            {
                a[i][j] = rand.nextInt(100);
                b[i][j] = rand.nextInt(100);
            }
        }

        for (int i = 0; i <  a.length; i++)
        {
            for (int j = 0; j < a.length; j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("\n\n\n\n");
        for (int i = 0; i <  a.length; i++)
        {
            for (int j = 0; j < a.length; j++)
            {
                System.out.print(b[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("\n\n\n\n");

        for (int i = 0; i <  a.length; i++)
        {
            for (int j = 0; j < a.length; j++)
            {
                a[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int i = 0; i <  a.length; i++)
        {
            for (int j = 0; j < a.length; j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println("");
        }

    }
}
