import javax.sql.rowset.spi.SyncResolver;
import java.util.Scanner;
public class Palindrom
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
            if( str.charAt(i) == str.charAt( str.length() - i -1 )  )
            counter++;
        }

        N *= 2;

        if( counter * 2 == N )
            System.out.println("It is a palindrome");
        else
            System.out.println("It is NOT a palindrome");
        
    }
}
