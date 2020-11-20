public class main
{
    public static void main(String[] args)
    {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Triangle(4, 5);
        shapes[1]  = new Rectangle(23, 7);
        shapes[2]  = new Circle(8);
        shapes[3]  = new Shape();
        shapes[4]  = new Circle(54);
        for (int i = 0; i < shapes.length; i++)
        {
            shapes[i].showArea();
        }
    }
}
