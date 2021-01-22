

import java.util.ArrayList;
import java.util.Collections;

//композиция
public class Order
{
    private int itemID;//предмет который клиент хочет купить
    private ArrayList <Product> purchasedItems = new ArrayList();
    private ArrayList<Integer> productIds = new ArrayList<>();
    private Customer customer;
    public Order(Product...goods)
    {
        for (int i = 0; i < goods.length; i++)
        {
            purchasedItems.add(goods[i]);
        }
    }

    public Order(int...products){
        for (int i = 0; i < products.length; i++){
            productIds.add(products[i]);
        }
    }

    public ArrayList<Integer> getProductIds() {
        return productIds;
    }

    public void showProducts()
    {
        for (int i = 0; i < purchasedItems.size(); i++)
        {
            purchasedItems.get(i).printItem();
        }
    }
}
