import java.util.Scanner;

public class Main
{


    java.util.Scanner sc = new java.util.Scanner(System.in);


    public static void main(String[] args)
    {
        Customer[] customers = new Customer[] {
            new Customer(1,"Alex", "Miller"),
            new Customer(2, "Solid", "Snake")
        };
        Apartment[] apartments = new Apartment[] {
            new Apartment(1408, ApartmentPrestige.ELITE, 2),
            new Apartment(542, ApartmentPrestige.MEDIUM, 4),
            new Apartment(205, ApartmentPrestige.LOW, 1)
        };
        Administrator admin = new Administrator(customers, apartments);

        while (true)
        {
            admin.login();
        }

    }
}
