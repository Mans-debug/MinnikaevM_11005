import java.util.ArrayList;

public class Shop {
    private Product[] products;
    private Customer[] customers;

    public Shop(Product[] products, Customer[] customers){
        this.customers = customers;
        this.products = products;
    }

    public void printCustomerOrders(int customerId){
        Customer customer = findCustomer(customerId);
        if (customer == null)
            return;

        ArrayList<Order> orders = customer.getOrders();
        for (int i = 0; i < orders.size(); i++){
            ArrayList<Integer> productIds = orders.get(i).getProductIds();
            for (int j = 0; j < productIds.size(); j++){
                products[productIds.get(j)].printItem();
            }
        }
    }

    private Customer findCustomer(int id) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getId() == id)
                return customers[i];
        }
        return null;
    }
}