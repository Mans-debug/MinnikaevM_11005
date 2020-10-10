//Поиск есть ли четные числа

import java.util.Scanner;
import java.util.Random;
public class LookEvenNum
{
    public static int[][] CreateMatrix (int length)
    {
        int result[][] = new int[length][length];
        Random rand = new Random();
        for (int i = 0; i < length; i++)
        {
            for (int j = 0; j < length; j++)
            {
                result[i][j] = rand.nextInt(15);
                System.out.print(result[i][j]+"\t");
            }
            System.out.println();
        }
        return result;
    }
    public static void print(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void MainMethod (int[][] matrix, int i, int j, int r, int[] results)
    {

        int length = matrix.length;


        if((i == length)||(j == length))
            return;

        int k = i;
        int t = j;
        if(k > t)
        {
            for (; k < length; k++, t++)
            {
            if(matrix[k][t] % 2 == 0)
                results[r] += 1;
            }
        }
        else
        {
            for (;t < length; k++, t++)
            {
                if(matrix[k][t] % 2 == 0){
                    results[r] += 1;

                }

            }
        }


        if((i>0)&&(j == 0))
        {
            MainMethod(matrix, i - 1, 0, r+1,results);
        }
        if(j>0)
        {

            MainMethod(matrix, i + 1, j+1, r+1,results);
        }
        if((i == 0)&&(j == 0))
        {

            MainMethod(matrix, 0, 1, r+1,results);
        }



    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of a matrix.");
        int length = sc.nextInt();

        int[] results = new int[2*length - 1];
        int[][] matrix = CreateMatrix(length);

        MainMethod(matrix, length - 1, 0, 0, results);

        System.out.print("The results are: ");
        print(results);
    }

}
