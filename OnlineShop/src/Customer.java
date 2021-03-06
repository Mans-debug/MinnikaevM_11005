import java.util.ArrayList;

public class Customer
{
    private String name;
    private int id;
    private String sex;
    private int age;
    ArrayList<Order> listOfOrder = new ArrayList<Order>();
    ArrayList<Integer> orderIds = new ArrayList<>();

   public Customer(String name, int id, String sex, int age)
    {
        this.name = name;
        this. id = id;
        this.sex = sex;
        this.age = age;

    }

    public Customer(String name, int id, String sex, int age, Product...orders)
    {
        this.name = name;
        this. id = id;
        this.sex = sex;
        this.age = age;
        makeNewOrder(orders);
    }

    public int getId() {
       return id;
    }

    public ArrayList<Order> getOrders(){
       return listOfOrder;
}

    void makeNewOrder(Product...orders)
    {
        Order order = new Order(orders);
        listOfOrder.add(order);
    }
    public void makeNewOrder(int...products){
       listOfOrder.add(new Order(products));
    }
    void addNewPurchase(Product...purchases)
    {
        Order order  = new Order(purchases);
        listOfOrder.add(order);
    }
    void showAllBoughtProducts()//передается массив продуктов, для того чтобы класс заказов знал,
    // откуда ему брать элементы
    {
        System.out.println(name + "'s history of purchases: ");
        for (int i = 0; i < listOfOrder.size(); i++)
        {
           listOfOrder.get(i).showProducts();
        }
    }

    public String getName()
    {
        return name;
    }

}
