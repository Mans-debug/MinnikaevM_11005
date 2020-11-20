

public class Product
{
    private int idOfProduct;
    private String nameOfProduct;
    private double price;
    private String manufacturer = "none";

    Product(int idOfProduct, String nameOfProduct, double price)
    {
        this.idOfProduct = idOfProduct;
        this.nameOfProduct = nameOfProduct;
        this.manufacturer = manufacturer;
        this.price = price;
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

