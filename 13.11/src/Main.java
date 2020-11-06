import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Player first = new Player("Димон");
        Player second = new Player("Булат");


        while((first.isDead() == false)&&(second.isDead() == false))
        {
            Game.setChance(first);
            Game.setChance(second);
            Game.minusHP(first,second);
            Game.minusHP(second, first);
            System.out.println("\n\n");
        }


    }
}
