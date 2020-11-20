public class Triangle extends Shape
{
    private double h;
    private double x;
    private double area;

    public Triangle(double h, double x)
    {
        this.h = h;
        this.x = x;
        area = h * x / 2;
    }
    @Override
    void showArea()
    {
        System.out.println("Area of the triangle is " + area);
    }
}
