import java.util.Random;

public class Request
{
    private int id;
    private int userId;
    private int numberOfRooms;
    private Days preferredTime;
    private ApartmentPrestige prestige;

    Request(int userId, int numberOfRooms, Days preferredTime, ApartmentPrestige prestige)
    {
        this.userId = userId;
        this.numberOfRooms = numberOfRooms;
        this.preferredTime = preferredTime;
        this.prestige = prestige;
        generateId();
    }

    //todo передать заявку администратору
    private void generateId()//создает id заказа
    {
        Random rand = new Random();
        id = rand.nextInt(10000);
    }

    public int getNumberOfRooms()
    {
        return numberOfRooms;
    }

    public Days getPreferredTime()
    {
        return preferredTime;
    }

    public ApartmentPrestige getPrestige()
    {
        return prestige;
    }
}
