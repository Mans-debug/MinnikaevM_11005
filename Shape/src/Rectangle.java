public class Rectangle extends Shape
{
    private double a;
    private double b;
    private double area;
    public Rectangle(double a, double b)
    {
        this.a = a;
        this.b = b;
        area = a * b;
    }

    @Override
    void showArea()
    {
        System.out.println("Area of the rectangle equals " + area);
    }
}
