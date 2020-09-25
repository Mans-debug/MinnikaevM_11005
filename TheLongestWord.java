import java.util.Scanner;
public class TheLongestWord
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int maxcounter = Integer.MIN_VALUE;
        int counter = 0;
        int minind = 0;
        int maxind = 0;
        int flag = 0;
        for (int i = 0; i < ch.length; i++)
        {
            if((ch[i] == ' ')||(i == ch.length - 1))
            {
                if ((i == ch.length - 1)&&(flag==0))
                    counter++;
                if(i == ch.length - 1)
                flag++;
                if(counter>maxcounter)
                {

                    maxcounter = counter;
                    maxind = i -1;
                    minind = i - counter;
                }
                counter = 0;
            }
            else
            {
                counter++;
            }

        }
        System.out.print("The longest word is \t");
        for (int j = minind; j <= maxind+1; j++)
        {
            System.out.print(ch[j]);


        }



    }

}
