

public class Customer
{
    private int id;
    private String name;
    private String secondName;
    private Request request;

    public Customer(int id, String name, String secondName)
    {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
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

    public String getName()
    {
        return name;
    }

    public String getSecondName()
    {
        return secondName;
    }
}
