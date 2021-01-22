public class Practice1
{
    public static Boolean condition1(String[] str)
    {
        Boolean bool = true;
        int counter = 0;
        for (int i = 0; i < str.length; i++)
        {
            if (Alphabet.amountOfVowels(str[i]) <= 3)
                bool = true;
            else
                return false;


        }
        return bool;

    }
    public static void condition2(String[] str)
    {
        if(condition1(str))
        {
            
        }
    }
    static class Alphabet
    {
        static final char[] vowelLower = {'e', 'y', 'u', 'o', 'a', 'i'};
        static final char[] vowelUpper = {'E', 'Y', 'U', 'O', 'A', 'I'};

        static final char[] consLower = {'q', 'w', 'r', 't', 'u', 'p', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm',};

        static int amountOfVowels(String str)
        {
            int counter = 0;
            for (int i = 0; i < str.length(); i++)
            {
                for (int j = 0; j < vowelLower.length; j++)
                {
                    if ((str.charAt(i) == vowelLower[j]) || (str.charAt(i) == vowelUpper[j]))
                        counter++;
                }
            }
            return counter;
        }
        static int isVowel(char ch)
        {
            for (int i = 0; i <vowelLower.length ; i++)
            {
                if((ch == vowelLower[i])||(ch == vowelUpper[i]))
                    return i;
            }
            return -1;
        }
       
        public static String clone(String str)
        {
            String newString;
            for (int i = 0; i < ; i++)
            {
                
            }
        }
        static String changeTo(String str)
        {
            String newString;
            for (int i = 0; i < str.length(); i++)
            {
                if(isVowel(str.charAt(i))>-1)
                {
                    clone(str);
                }
            }
        }
    }
}
    
