public abstract class Group
{
    String name;
    int amountOfParticipants;
    public Group(String name, int amountOfParticipants)
    {
        this.name = name;
        this.amountOfParticipants = amountOfParticipants;
    }

    protected Group()
    {
    }

    abstract void banAPerson(User user);
    abstract void ToString();
    void deleteGroup(Group group)
    {
        System.out.println("Group " + name + " has been deleted.");
    }

}
