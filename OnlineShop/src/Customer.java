import java.util.ArrayList;

public class Customer
{
    private String name;
    private int id;
    private String sex;
    private int age;
    ArrayList<Order> listOfOrder = new ArrayList<Order>();

   public Customer(String name, int id, String sex, int age)
    {
        this.name = name;
        this. id = id;
        this.sex = sex;
        this.age = age;

    }
    public Customer(String name, int id, String sex, int age, int...orders)
    {
        this.name = name;
        this. id = id;
        this.sex = sex;
        this.age = age;
        makeNewOrder(orders);
    }

    void makeNewOrder(int...idies)
    {
        Order order = new Order(idies);
        listOfOrder.add(order);
    }
    void addNewPurchase(int...purchases)
    {
        Order order  = new Order(purchases);
        listOfOrder.add(order);
    }
    void showAllBoughtProducts(Product[] products)//передается массив продуктов, для того чтобы класс заказов знал,
    // откуда ему брать элементы
    {
        System.out.println(name + "'s history of purchases: ");
        for (int i = 0; i < listOfOrder.size(); i++)
        {
            listOfOrder.get(i).getProducts(products);
        }
    }

    public String getName()
    {
        return name;
    }

}
