import java.util.ArrayList;

public class Apartment
{
    private int id;
    private Boolean[] days = new Boolean[7];
    private ApartmentPrestige prestige;
    private int room;
    private static ArrayList<Apartment> listOfApartments = new ArrayList<>();

    Apartment()
    {
        id = 666;
    }

    public Apartment(int id, ApartmentPrestige prestige, int room)
    {
        this.id = id;
        this.prestige = prestige;
        this.room = room;
        for (int i = 0; i < 7; i++)
        {
            days[i] = false;
        }
        listOfApartments.add(this);
    }

    public Boolean compare(Request request)
    {
        if ((room == request.getNumberOfRooms())
                && prestige == request.getPrestige()
                && (days[request.getPreferredTime().ordinal()] == false))
        {
            return true;
        } else
            return false;
    }

    public int getId()
    {
        return id;
    }

    public Boolean[] getDays()
    {
        return days;
    }

    public static Apartment findById(int id)
    {
        Apartment ap = new Apartment();
        for (int i = 0; i < listOfApartments.size(); i++)
        {
            if (listOfApartments.get(i).id == id)
                ap = listOfApartments.get(i);
        }
        return ap;
    }
}