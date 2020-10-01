//сортировка массива (последнее задание в домашней работе)
import java.util.Random;
import java.util.Scanner;
public class SortByString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter a quantity of rows.");
        int x = sc.nextInt();
        System.out.println("Enter a quantity of columns.");
        int y = sc.nextInt();
        int[][] arr = new int[x][y];
        for (int i = 0; i < x; i++)
        {
            for (int j = 0; j < y; j++)
                arr[i][j] = rand.nextInt(10);
        }

        for (int i = 0; i < x; i++)
        {
            for (int j = 0; j < y; j++)
                System.out.print(arr[i][j]+"\t");
            System.out.println();
        }
        System.out.println("\n");

        int min = Integer.MAX_VALUE;
        int index = 0;
        int counter = 0;
        int holder;
        int i;
        while (counter < y - 1)
        {
            for ( i = counter; i < y ; i++)
            {
                if (arr[0][i] < min)
                {
                    index = i;
                    min = arr[0][i];
                }

            }
            for(i = 0 ; i < x; i++ )
            {
                if (i == 0)
                {
                    holder = arr[i][0 + counter];
                    arr[i][0+counter]=min;
                    arr[i][index] = holder;
                }
                else
                {
                    holder = arr[i][0 + counter];
                    arr[i][0+counter]=arr[i][index];
                    arr[i][index] = holder;

                }


            }
            counter++;
            min = Integer.MAX_VALUE;
        }
        for ( i = 0; i < x; i++)
        {
            for (int j = 0; j < y; j++)
                System.out.print(arr[i][j]+"\t");
            System.out.println();
        }


    }
}
