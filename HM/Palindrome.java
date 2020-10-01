//является ли слово палиндромом или нет
import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char symb;
        int counter = 0;
        int N;

        if( str.length() % 2 == 0)
            N = str.length() / 2;
        else
            N = str.length() / 2 + 1;

        for (int i = 0; i < N; i++)
        {
            if( Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(str.charAt( str.length() - i -1 ))  )
                counter++;
        }

        if( str.length() % 2 == 0) {
            N = str.length();
            counter*=2;
        }
        else {
            N = str.length() - 1;
            counter = (counter - 1) * 2;
        }

        if( counter== N )
            System.out.println("It is a palindrome");
        else
            System.out.println("It is NOT a palindrome");
        System.out.println(counter);
        System.out.println(N);

    }
}

