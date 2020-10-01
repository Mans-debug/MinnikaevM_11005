//подсчет не повторяющихся символов
import java.util.Scanner;

public class NePovtor {

    static Scanner scan = new Scanner(System.in);
    static String slovo = scan.nextLine();
    static char[] slovoChar = slovo.toCharArray();
    static int nePovtor = 0;

    public static void main(String[] args) {
        for (int i = 0; i < slovoChar.length; i++) {
            int colvo = 0;
            for (int j = 0; j < slovoChar.length; j++) {
                if (slovoChar[i] != slovoChar[j]) {
                    colvo++;
                }
            }
            if (colvo == slovoChar.length - 1) {
                nePovtor++;
            }

        }
        System.out.println(nePovtor);
    }

}



