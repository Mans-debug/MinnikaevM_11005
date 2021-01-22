public class User implements Post, SendAMessage, Upload
{
    int id;
    String sex;
    int age;
    String firstName;
    String secondName;

    public User(String firstName, String secondName)
    {
        this.firstName = firstName;
        this.secondName = secondName;
    }
    public User(String firstName, String secondName, int age, String sex)
    {
        this(firstName,secondName);
        this.age = age;
        this.sex = this.sex;
    }
    public String toString()
    {
        System.out.printf("My name is d%, my second name is d%. I am d% years old.",firstName,secondName,age);
        return null;
    }


    @Override
    public void writeText(String text)
    {
        System.out.println("Хочу написать на своей стене следующее послание " + text);
    }

    @Override
    public void sendAMessage(User user,String str)
    {
        System.out.println("Хэй, привет ," + user.firstName +", я вот что хотел сказать " + str);
    }

    @Override
    public void uploadPhoto()
    {
        System.out.println("Загружаю фоточку");
    }

    @Override
    public void uploadMusic(String str)
    {
        System.out.println("Загружаю свою любимейшую песню "+ str);
    }

    void resetPass()
    {
        System.out.println("Я поменял пароль");
    }
}
