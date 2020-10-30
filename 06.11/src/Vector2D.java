public class Vector2D
{
    private double x;
    private double y;

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

    public void printRes(String operation, double a, double b)
    {
        System.out.println(operation + " of the vectors is (" + a + ';'+b+')'+'.' );
    }
    public void printResMult(double a, double b)
    {
        System.out.println("Multiplication of the vector and the constant is (" + a + ';'+b+')'+'.' );
    }

    public void sumOfVectors(Vector2D other)
    {
        this.x += other.y;
        this.y += other.y;
        printRes("Sum", this.x, this.y);

    }
    public void subOfVectors(Vector2D other)
    {

        this.x -= other.y;
        this.y -= other.y;
        printRes("Sum", this.x, this.y);
        printRes("Subtraction", this.x, this.y);
    }
    public void multOfVectors(double number)
    {
        this.x *= number;
        this.y *= number;
        printResMult( this.x, this.y);
    }
}
