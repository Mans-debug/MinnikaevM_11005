import java.util.ArrayList;
import java.util.Scanner;

//по сути главная задача админа - просто решать,
//может ли клиент заехать в указанное время или нет
//опционально админ может еще предложить варианты
public class Administrator
{
    private ArrayList<Request> requestList = new ArrayList<>();
    private Customer[] customers;
    private Apartment[] apartments;


    Administrator(Customer[] customers, Apartment[] apartments)
    {
        this.customers = customers;
        this.apartments = apartments;
    }

    Administrator()
    {
    }

    public  Customer findName(String firstName, String secondName)//в админа
    {
        Customer customer = new Customer(0, "0", "0");
        for (int i = 0; i < customers.length; i++)
        {
            if ((customers[i].getName().equals(firstName)) && (customers[i].getSecondName().equals(secondName)))
            {
                customer = customers[i];
            }
        }
        return customer;
    }
    public int validateOrder(Request request)
    {
        requestList.add(request);
        int idOfRoom = 0;


        for (int i = 0; i < apartments.length; i++)
        {
            if (apartments[i].compare(request) == true)
            {
                idOfRoom = apartments[i].getId();
                break;
            }
        }

        System.out.println();
        return idOfRoom;
    }

    public void login()
    {
        System.out.println("If you are willing to quit at some stage of the program, you can type 666\nIt'll stop it");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String firstName = "zero";
        String secondName = "zero";
        try
        {
            firstName = sc.next();
            secondName = sc.next();
        } catch (Exception e)
        {
            System.out.println("Invalid input");
            return;
        }
        System.out.println();

        Customer customer = findName(firstName, secondName);
        if (customer.getId() == 0)
            return;

        System.out.println("Welcome!\n " +
                "\n Please tell us how many rooms do you want?");
        int room;
        System.out.println("1. One room" +
                "\n2. Two rooms" +
                "\n3. Four rooms");
        int n = 0;
        try
        {
            n = sc.nextInt();
        }
        catch (Exception e)
        {
            System.out.println("Invalid input\n");
            return;
        }
        switch (n)
        {
            case 1:
                room = 1;
                break;
            case 2:
                room = 2;
                break;
            case 4:
                room = 4;
                break;
            default:
                System.out.println("Sorry for inconvenience but currently we don't have that option" +
                        "\n Come back later! ");
                return;


        }
        Days day = null;
        System.out.println();
        System.out.println("What day do you want to check in?");
        for (int i = 1; i <= Days.values().length; i++)
        {
            System.out.println(i + ". " + Days.values()[i - 1]);
        }
        int temp = 0;
        while ((temp < 1) || (temp > 7))
        {
            try
            {
                temp = sc.nextInt();
            }
            catch (Exception e)
            {
                System.out.println("Invalid input\n");
                return;
            }

            if (temp == 666)
                return;
        }
        day = Days.values()[temp - 1];

        System.out.println("What apartment prestige do you want? ");

        ApartmentPrestige prestige = null;
        for (int i = 1; i <= ApartmentPrestige.values().length; i++)
        {
            System.out.println(i + ". " + ApartmentPrestige.values()[i - 1]);
        }

        try
        {
            temp = sc.nextInt();
        }
        catch (Exception e)
        {
            System.out.println("Invalid input\n");
            return;
        }
        while ((temp < 1) || (temp > 3))
        {
            try
            {
                temp = sc.nextInt();
            }
            catch (Exception e)
            {
                System.out.println("Invalid input\n");
                return;
            }

            if (temp == 666)
                return;
        }
        prestige = ApartmentPrestige.values()[temp - 1];



        int number = validateOrder(customer.newRequest(room, day, prestige));
        if (number == 0)
        {
            System.out.println("There is no such rooms!");//todo поставить цикл
            return;
        }
        System.out.println("Your order is confirmed, your room number is " + number);
        System.out.println();
        System.out.println("You may pay for the room, wanna do it now?\n");
        System.out.println("1. Yes\n2. No");
        try
        {
            temp = sc.nextInt();
        }
        catch (Exception e)
        {
            System.out.println("Invalid input\n");
            return;
        }
        if (temp != 1)//если пользователь нажал на кнопку "нет" или любую другую кнопку
        {
            return;
        }
        Apartment.findById(number).getDays()[day.ordinal()] = true;
        System.out.println("Your payment is successful");

    }

}
