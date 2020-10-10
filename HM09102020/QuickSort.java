//Первое и второе задание совмещенное (quick sort and binary search)
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class QuickSort
{
    public static void print (int[] arr)//Для вывода массива
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void randArr (int[] a, int x)//Для заполнения массива рандомными числами
    {
        Random rrr = new Random();
        for (int i = 0; i < x; i++)
        {
            a[i] = rrr.nextInt(100);
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void Sort (int[] b, int from, int to)//Быстрая сортировка
    {
        if(from == to)
            return;
        if(from >= to)
            return;
        int middle = from + (to - from) / 2;
        int opora = b[middle];

        int i = from, j = to;

        while(i < j)
        {
            while(b[i] < opora)
                i++;
            while(b[j] > opora)
                j--;
            if ( i <= j)
            {
                int temp = b[i];
                b[i] = b[j];
                b[j] = temp;
                i++;
                j--;
            }
    
        }
        if(from < j)
            Sort(b, from, j);
        if(to > i)
            Sort(b, i, to);
    }
    public static void BinSr (int[] array, int number, int from, int to)//Бинарный поиск
    {
        int index = -1;
        while(from <= to)
        {
            int mid = (from + to) / 2;

            if(array[mid] < number)
            {
                from = mid + 1;
            }
            else if(array[mid] > number)
            {
                to = mid - 1;
            }
            else if(array[mid] == number)
            {
                index = mid;
                break;
            }

        }
        if(index == -1)
            System.out.println("There is no such number.");
        else
        {
            index +=1;
            System.out.println("Your number is on the " + index + "th position");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int x = sc.nextInt();

        int[] arr = new int[x];
        System.out.print("Random array: ");
        randArr(arr, x);

        int from = 0;
        int to = x - 1;

        System.out.print("Sorted array: ");
        Sort(arr, from, to); //Быстрая сортировка
        print(arr);

        System.out.println("Type a number that you want to find: ");
        BinSr(arr, sc.nextInt(), from, to); //Бинарный поиск


    }
}