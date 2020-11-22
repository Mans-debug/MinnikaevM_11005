

import java.util.ArrayList;
//композиция
public class Order
{
    private int itemID;//предмет который клиент хочет купить
    private ArrayList <Integer> purchasedItems = new ArrayList();
    private Customer customer;
    private Product product;

    //если у покупателя не было покупок в магазине
    public Order(int...itemIDs)
    {
        for (int i = 0; i < itemIDs.length; i++)
        {
            purchasedItems.add(itemIDs[i]);
        }
    }


    public ArrayList<Integer> getPurchasedItems()
    {
        return purchasedItems;
    }
    public void getProducts(Product[] products)
    {
        for (int i = 0; i < purchasedItems.size(); i++)
        {
            products[purchasedItems.get(i)].getItem();
        }
    }
}
