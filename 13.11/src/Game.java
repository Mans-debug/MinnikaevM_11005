

import java.util.Random;

public class Game
{
    Random rand = new Random();
    private static double chance;

    static void setChance(Player object)
    {
        object.setPunch();
        chance = 1 - object.punch/9 + 0.11;//возможно надо будет 9 на 10 сменить
        System.out.println("Power of "+object.getUserName() + " is " + object.punch );
        System.out.println("Chance of "+object.getUserName() + " is " + chance );

    }
    static Boolean punchedOrNot(Player objected)
    {
        double bound = Math.random();
        System.out.println("Bound is " + bound);
        if(chance >= bound)
            return true;
        else
            return false;
    }

    static void minusHP(Player one, Player another)
    {
        if(punchedOrNot(another) == true)
        {
            one.setHealthPoints(one.getHealthPoints() - one.punch);
            System.out.println(one.getUserName() + " Health status: " + one.getHealthPoints());
        }
        else
            System.out.println(another.getUserName() + " MISSED");
    }


}
