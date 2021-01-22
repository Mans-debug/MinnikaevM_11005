/*
import java.io.IOException;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile
{
    private Enum<ApartmentPrestige> getEnum()
    {

    }
    public Customer[] read() throws FileNotFoundException
    {
        ArrayList<Customer> list = new ArrayList<>();
        File file = new File("customers.txt");
        Scanner sc = new Scanner(file);

        while (sc.next() != null)
        {
            Customer customer = new Customer(sc.nextInt(), sc.next(), sc.next());
            list.add(customer);
        }
        */
/*Customer[] customers = list.toArray(new Customer[]);*//*

        return customers;
    }

    public Apartment[] readAp() throws FileNotFoundException
    {
        ArrayList<Apartment> apartments = new ArrayList<>();
        File file = new File("apartments.txt");
        Scanner sc = new Scanner(file);
        while(sc.next()!=null)
        {

        }
    }
}
*/
