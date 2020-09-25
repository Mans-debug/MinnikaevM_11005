import java.util.Scanner;
import java.util.Random;

public class MatrixMult
{


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int max = 0;

        System.out.println("Enter a number of rows in the first matrix.");
        int x1 = sc.nextInt();
        if(x1>max)
            max =  x1;
        System.out.println("Enter a number of columns in the first matrix.");
        int y1 = sc.nextInt();
        if(y1>max)
            max = y1;
        System.out.println("Enter a number of rows in the second  matrix.");
        int x2 = sc.nextInt();
        if(x2>max)
            max =  x2;
        System.out.println("Enter a number of columns in the second matrix.");
        int y2 = sc.nextInt();
        if(y2>max)
            max =  y2;

        if(y1==x2) {

            int[][] matr1 = new int[max][max];
            int[][] matr2 = new int[max][max];
            int[][] res = new int[max][max];

            int i, j;

            for (i = 0; i < x1; i++)//заполнение первого массива
            {
                for (j = 0; j < y1; j++)
                    matr1[i][j] = rand.nextInt(10);
            }

            for (i = 0; i < x2; i++)//заполнение второго массива
            {
                for (j = 0; j < y2; j++)
                    matr2[i][j] = rand.nextInt(10);
            }

            for (i = 0; i < x1; i++)//вывож
            {
                for (j = 0; j < y1; j++)
                    System.out.print(matr1[i][j] + "\t");
                System.out.println();
            }
            System.out.println("\n\n");

            for (i = 0; i < x1; i++)//вывод
            {
                for (j = 0; j < y2; j++)
                    System.out.print(matr2[i][j] + "\t");
                System.out.println();
            }
            System.out.println("\n\n");

            for (i = 0; i < max; i++) {
                for (j = 0; j < max; j++) {
                    for (int k = 0; k < x2; k++) {
                        res[i][j] += matr1[i][k] * matr2[k][j];
                    }
                }
            }


            for (i = 0; i < x1; i++)//вывод
            {
                for (j = 0; j < y2; j++)
                    System.out.print(res[i][j] + "\t");
                System.out.println();
            }
            System.out.println("\n\n");
        }
        else
            return;
    }
}
