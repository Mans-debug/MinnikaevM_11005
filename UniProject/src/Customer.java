import java.util.ArrayList;

public class Customer
{
    private int id;
    private String name;
    private String secondName;
    private Request request;
    private static ArrayList<Customer> listOfCustomers = new ArrayList<>();

    public Customer(int id, String name, String secondName)
    {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
        listOfCustomers.add(this);
    }

    Request newRequest(int numberOfRooms, Days preferredTime, ApartmentPrestige prestige)
    {
        Request newRequest = new Request(id, numberOfRooms, preferredTime, prestige);
        return newRequest;
    }

    public int getId()
    {
        return id;
    }

    public Request getRequest()
    {
        return request;
    }

    public String getName()
    {
        return name;
    }

    public static Customer findName(String firstName, String secondName)
    {
        Customer customer = new Customer(0, "0", "0");
        for (int i = 0; i < listOfCustomers.size(); i++)
        {
            if ((listOfCustomers.get(i).name.equals(firstName)) && (listOfCustomers.get(i).secondName.equals(secondName)))
            {
                customer = listOfCustomers.get(i);
            }
        }
        return customer;
    }

}
