import java.util.Scanner;
import java.util.Random;
public class Trans
{
    public static void main(String[] args)
    {
        int x, y;//размеры матриц
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in the size of a matrix.");
        x = sc.nextInt(); y = sc.nextInt();
        int[][] a = new int[x][y];
        int[][] b = new int [y][x];


        for (int i = 0; i < x; i++)
        {
            for (int j = 0; j < y; j++)
            {
                a[i][j] = rand.nextInt(100);

            }
        }
        for (int i = 0; i < x; i++)
        {
            for (int j = 0; j < y; j++)
            {
                System.out.print(a[i][j]+"\t");

            }
            System.out.println("");
        }
        System.out.println("\n\n\n\n");
        int holder;

        for (int i = 0; i < x













































































































































































































































































                ; i++)
        {
            for (int j = 0; j < y; j++)
            {
                if(i==j)
                    b[i][j] = a[i][j];
                else
                {
                    b[j][i] = a[i][j];

                }

            }
        }
        for (int i = 0; i < y; i++)
        {
            for (int j = 0; j < x; j++)
            {
                System.out.print(b[i][j]+"\t");

            }
            System.out.println("");
        }

    }
}