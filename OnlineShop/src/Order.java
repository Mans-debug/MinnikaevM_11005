

import java.util.ArrayList;
//композиция
public class Order
{
    private int itemID;//предмет который клиент хочет купить
    private ArrayList <Product> purchasedItems = new ArrayList();
    private Customer customer;
    public Order(Product...goods)
    {
        for (int i = 0; i < goods.length; i++)
        {
            purchasedItems.add(goods[i]);
        }
    }



    public void showProducts()
    {
        for (int i = 0; i < purchasedItems.size(); i++)
        {
            purchasedItems.get(i).printItem();
        }
    }
}
