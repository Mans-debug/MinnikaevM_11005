import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Main
{
    static Storage storage = new Storage();
    public static Boolean ifSmallerThanStorage(Coffee object)
    {

        if((object.syrop <= storage.syrop) && (object.milk <= storage.milk) &&
            (object.chocolate <= storage.syrop) && (object.coffee <= storage.coffee))
            return true;
        else
            return false;
    }
    public static void output(Coffee[] arr)
    {
        for (int i = 0, k = 1; i < arr.length; i++)
        {
            if(ifSmallerThanStorage(arr[i]))
            {
                System.out.println(k + ". " +arr[i].name);
                arr[i].number = k;
                k++;
            }
        }
    }
    public static int blank(Coffee[] arr, int number)
    {
        int result = -10;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i].number == number)
                result = i;
        }
        return result;
    }
    public static void makingCoffee(Coffee object)
    {
        System.out.println("Your " + object.name + " gonna be reade in a few minutes!");
        System.out.println("Boiling water...");
        if(object.syrop > 0)
        {
            System.out.println("Adding syrop to your drink...\n");
            storage.syrop -= object.syrop;
        }
        if(object.milk > 0)
        {
            System.out.println("Heating milk...");
            System.out.println("Adding milk to your drink...\n");
            storage.milk -= object.milk;
        }
        if(object.chocolate > 0)
        {
            System.out.println("Melting chocolate bar :)");
            System.out.println("Adding chocolate to your drink...\n");
            storage.chocolate -= object.chocolate;
        }
        if(object.sugar > 0)
        {
            System.out.println("Adding sugar to your drink...\n");
            storage.sugar -= object.sugar;
        }
        if(object.coffee > 0)
        {
            System.out.println("Adding coffee to your drink...\n");
            storage.coffee -= object.coffee;
        }
        System.out.println("Your coffee is ready :)\n");
    }
    public static void coutStorage(Storage object)
    {
        System.out.println("STORAGE STATUS");
        System.out.println("Coffee: " + object.coffee);
        System.out.println("Milk: " + object.milk);
        System.out.println("Syrop: " + object.syrop);
        System.out.println("Sugar: " + object.sugar);
        System.out.println("Chocolate " + object.chocolate);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Boolean cont = true;

            Coffee[] kofeArr = new Coffee[5];
            kofeArr[0] = new Coffee("Latte", 0, 4, 1);
            kofeArr[1] = new Coffee("Hot chocolate", 2, 2, 5);
            kofeArr[2] = new Coffee("Americano", 0, 0, 0);
            kofeArr[3] = new Coffee("Mocco", 2, 2, 2);
            kofeArr[4] = new Coffee("Capuccino", 1, 2, 1);
        while(cont)
        {
            coutStorage(storage);
            output(kofeArr); //вывод тех на которых хватае ингрендиентов

            System.out.println("Choose a drink");
            int number = sc.nextInt();
            System.out.println("You have chosen" + kofeArr[blank(kofeArr, number)].name);
            System.out.println("How much sugar do you want?");

            int sugar = sc.nextInt();
            while (sugar >= storage.sugar)
            {
                System.out.println("We don't have that much");
                System.out.println("1. Change the amount of sugar \n" +
                        "2. Quit");
                switch (sc.nextInt())
                {
                    case 1:
                        sugar = sc.nextInt();
                        break;
                    case 2:
                        System.out.println("Cya");
                        return;
                    default:
                        System.out.println("Big Brother watches YOU");
                        return;
                }
            }
            kofeArr[blank(kofeArr, number)].sugar = sugar;
            makingCoffee(kofeArr[blank(kofeArr, number)]);
            System.out.println("Wanna another one? \n" +
                    "1. Yes\n" +
                    "2. No");
            int var = sc.nextInt();

            if (var == 1)
                cont = true;
            if (var == 2)
                cont = false;
        }



    }
}
