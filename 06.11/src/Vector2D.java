public class Vector2D
{
    private double x;
    private double y;
    double sumX = 0, sumY = 0;


    public Vector2D(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }
    public void sumOfVectors(Vector2D other)
    {
        this.sumX = this.x + other.x;
        this.sumY = this.y + other.y;
        System.out.println("Sum of the vectors is (" + this.sumX + ';'+this.sumY+')'+'.' );
        sumX = 0; sumY = 0;
    }
    public void subOfVectors(Vector2D other)
    {
        sumX = this.x - other.x;
        sumY = this.y - other.y;
        System.out.println("Subtraction of the vectors is (" + sumX + ';'+sumY+')'+'.' );
        sumX = 0; sumY = 0;
    }
    public void multOfVectors(double number)
    {
        sumX = 1; sumY = 1;
        sumX = this.x * number;
        sumY = this.y * number;
        System.out.println("Multiplication of the vector and the constant  is (" + sumX + ';'+sumY+')'+'.' );
        sumX = 0; sumY = 0;
    }
}
