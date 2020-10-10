import java.util.Scanner;
public class SortAlphabet
{
     class Elements
    {
        int value = 0;
        Elements(int length, String str)
        {
            char[] word = new char[length];

            for (int i = 0; i < length; i++)
            {
                word[i] = str.charAt(i);
            }
            int k = length;
            for (int i = 0; i < length; i++, k--)
            {
                value += word[i] * k;
            }
        }
    }

    public  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of words");
        int length = sc.nextInt();
        System.out.println("Enter a number of words");
        int number = sc.nextInt();

    }
}