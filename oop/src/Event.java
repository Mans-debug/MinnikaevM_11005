public class Event extends Group
{
    String date;
    String description;

    public Event(String name, int amountOfParticipants, String date, String description)
    {
        super(name, amountOfParticipants);
        this.date = date;
        this.description = description;
    }
    @Override
    void banAPerson(User user)
    {
        System.out.println("Доступ к событию был закрыть пользователяю " + user.firstName+" "+ user.secondName);
    }

    @Override
    void ToString()
    {
        System.out.println("Привет, мы проводим событие " + name + " к нам придет " + amountOfParticipants+ " человек\n" +
                "Описание события:\n " + description);
    }
}
