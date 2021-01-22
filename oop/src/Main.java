public class Main
{
    public static void main(String[] args)
    {
        Group[] groups = {new SportsGroup("Football", "22.12.5342","MkaSka", 345634), new Event("Прогулка", 200000, "23.01.2021", "Просто мирная прогулка по Баумана") };
        User user = new User("Mans", "Minn", 19, "male");
        User techMan = new TechMan("Grek", "Lemm", 55);
        for (int i = 0; i < 2; i++)
        {
            groups[i].banAPerson(user);
            groups[i].toString();
        }
        user.writeText("ухаухахуха я победил");
        groups[0].
    }
}
