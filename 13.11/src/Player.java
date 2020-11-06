import com.sun.org.apache.xpath.internal.objects.XObject;

import java.util.Random;

public class Player
{
    private String userName;
    private double healthPoints = 100.0;
    double punch;
    public Player(String userName)
    {
        this.userName = userName;
    }
    void setPunch()
    {
        Random rand = new Random();
        punch = 1 + rand.nextInt(8);
    }

    public String getUserName()
    {
        return userName;
    }

    public double getHealthPoints()
    {
        return healthPoints;
    }

    public double setHealthPoints(double object)
{
    healthPoints = object;
    return healthPoints;
}

    public Boolean isDead()
    {
        if(this.healthPoints <= 0)
        {
            System.out.println(this.userName + " has zero hp." );
            return true;
        }
        else
            return false;


    }

}
