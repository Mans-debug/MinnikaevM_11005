import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
//композиция//дата классы//заполнение массива объектов с помощью Int[] and String[]
public class Main
{
    ArrayList<Customer> listOFCustomers = generateCustomers();

    static ArrayList<Customer> generateCustomers()
    {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        try
        {
            Scanner sc = new Scanner(new FileReader("C:\\Users\\mansu\\IdeaProjects\\MinnikaevM_11005\\OnlineShop\\src\\customer.txt"));
            while(sc.hasNext())
            {
                customers.add(
                        new Customer(sc.next(), sc.nextInt(), sc.next(), sc.nextInt() ) );
            }

        } catch (IOException e)
        {
            System.out.println("File has not been found");
        }

        return customers;
    }

    public static void main(String[] args)
    {
        ArrayList<Customer> listOFCustomers = generateCustomers();


        System.out.println(listOFCustomers.get(0).getName());


       /* Product[] products = new Product[15];


        products[0] = new Product(0, "none", 0, "none");
        products[1] = new Product(1, "MAGA cap", 6.66, "D. Trump");
        products[2] = new Product(2, "Chair", 19.99, "ikea");
        products[3] = new Product(3, "Tesla Truck", 66666.666, "iLoN MaSk");
        products[4] = new Product(4, "PS 5xOne 360", 499.50, "Microny");
        products[5] = new Product(5, "Desk", 80, "IKEA");
        products[6] = new Product(6, "Swiss knife", 199, "Sweden");
        products[7] = new Product(7, "MacBook Pro 2015", 650, "Huawei");

        Customer clients[] = new Customer[3];
        clients[0] = new Customer("Jeniffer", 1289, "female", 23, products[3], products[7]);
        clients[1] = new Customer("Peter", 194, "male", 12, products[2], products[4]);
        clients[2] = new Customer("Dolores", 1394, "female", 75, products[6], products[5]);

       *//* clients[0].showAllBoughtProducts();
        clients[0].addNewPurchase(products[4], products[6], products[3]);

        clients[0].showAllBoughtProducts();
        clients[1].showAllBoughtProducts();
        clients[2].showAllBoughtProducts();
*//*

        clients[1].makeNewOrder(1, 2, 3, 4);

        Shop shop = new Shop(products, clients);
        shop.printCustomerOrders(194);*/

        
    }

}
