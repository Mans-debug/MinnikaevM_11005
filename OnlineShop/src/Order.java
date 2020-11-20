

import java.util.ArrayList;
//композиция
public class Order
{
    private int itemID;//предмет который клиент хочет купить
    private ArrayList <Integer> purchasedItems = new ArrayList();
    private Customer customer;
    private Product[] product;

    //если у покупателя не было покупок в магазине
    public Order(Customer customer, Product product[])
    {
        this.customer = customer;
        this.product = product;
    }

    public void setOrderList(int ... arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            purchasedItems.add((Integer) arr[i]);
        }
    }
    void addNewPurchase(int idOfItem)
    {
        purchasedItems.add(idOfItem);
    }

    void showAllBoughtItems()
    {
        for (int i = 0; i < purchasedItems.size(); i++)
        {
            Integer temp = Integer.valueOf(purchasedItems.get(i));
            System.out.println("Product name" + product[temp].getNameOfProduct());
            System.out.println("Manufacturer: " + product[temp].getManufacturer());
            System.out.println("Price: " + product[temp].getPrice());
            if(i != purchasedItems.size() - 1)
            System.out.println("________________");
        }
        System.out.println("_______________________________________________________________________");
    }
}
