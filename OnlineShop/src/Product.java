

public class Product
{
    private int idOfProduct;
    private String nameOfProduct;
    private double price;
    private String manufacturer;

    Product()
    {

    }
    Product(int idOfProduct, String nameOfProduct, double price, String manufacturer)
    {
        this.idOfProduct = idOfProduct;
        this.nameOfProduct = nameOfProduct;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public void getItem()
    {
        System.out.printf("Name: %s\n" +
                "Manufacturer: %s\n" +
                "Price: %s\n" +
                "ID: %s\n",
                getNameOfProduct(),getManufacturer(),getPrice(),getIdOfProduct());
        System.out.println("_____________________________________________________");
    }

    public int getIdOfProduct()
    {
        return idOfProduct;
    }

    public String getNameOfProduct()
    {
        return nameOfProduct;
    }

    public double getPrice()
    {
        return price;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }
}

