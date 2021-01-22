public class SportsGroup extends Group implements Post, Upload
{
    String kindOfSport;
    String theNextGameDate;

    public SportsGroup(String kindOfSport, String theNextGameDate, String name, int amountOfParticipants)
    {
        super(name,amountOfParticipants);
        this.kindOfSport = kindOfSport;
        this.theNextGameDate = theNextGameDate;
    }
    public SportsGroup()
    {}


    @Override
    void banAPerson(User user)
    {
        System.out.println(user.firstName + user.secondName + "has been deleted");
    }

    @Override
    void ToString()
    {
        System.out.println("The name of our group is "
        + name + " amount of participants in our group is " + amountOfParticipants
                        + "we are devoting our lives to "+ kindOfSport
                );

    }

    @Override
    public void writeText(String text)
    {
        System.out.println("Внимание обращение администратора группы по " + kindOfSport +"\n" + text);
    }

    @Override
    public void uploadPhoto()
    {
        System.out.println("Смотрите какая эпичная победа в " + kindOfSport);
    }

    @Override
    public void uploadMusic(String str)
    {
        System.out.println("Музыка победителей"+ str+" по " + kindOfSport);
    }
}
