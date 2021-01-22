public class TechMan extends User
{
    int personalNumber;


    public TechMan(String firstName, String secondName, int personalNumber)
    {
        super(firstName, secondName);
    }

    void unban(User user)
    {
        System.out.println("Вы разбанили пользователя " + user.firstName+ " "+ user.secondName);
    }
    void resetPass(User user)
    {
        System.out.println("Вы помогли пользователю сбросить пароль");
    }
}
