import java.util.Scanner;
//композиция//дата классы//заполнение массива объектов с помощью Int[] and String[]
public class Main
{

    public static void main(String[] args)
    {   
        Product[] products = new Product[15];

        products[0] = new Product(0, "none", 0, "none");
        products[1] = new Product(1, "MAGA cap", 6.66, "USA government");
        products[2] = new Product(2, "Chair", 19.99, "ikea");
        products[3] = new Product(3, "Tesla Truck", 66666.666, "iLoN MaSk");
        products[4] = new Product(4, "PS 5xOne 360", 499.50, "Microny");
        products[5] = new Product(5, "Desk", 80, "IKEA");
        products[6] = new Product(6, "Swiss knife", 199, "Sweden");
        products[7] = new Product(7, "MacBook Pro 2015", 650, "Huawei");

        Customer clients[] = new Customer[5];
        clients[0] = new Customer("Mike", 234, "male", 23);
        clients[1] = new Customer("Jeniffer", 435, "female", 49);
        clients[2] = new Customer("Ronald", 787, "male", 16);
        clients[3] = new Customer("Leonard", 1452, "male", 62);
        clients[4] = new Customer("Julius", 725, "male", 47);

        Order[] orders = new Order[5];
        orders[0] = new Order(clients[0], products);
        orders[1] = new Order(clients[1], products);
        orders[2] = new Order(clients[2], products);
        orders[3] = new Order(clients[3], products);
        orders[4] = new Order(clients[4], products);

        orders[0].setOrderList(2, 5 ,7);
        orders[1].setOrderList(7, 3, 4);
        orders[3].setOrderList(1, 6);

        orders[3].addNewPurchase(4);

        orders[0].showAllBoughtItems();
        orders[1].showAllBoughtItems();
        orders[3].showAllBoughtItems();



        
    }

}
