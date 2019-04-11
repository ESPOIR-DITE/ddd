package company.com;

public class Order {
    private int orderNumber;
    private String item;
    private String driver;
    private String customer;

    public String getCustomer()
    {
        return customer;
    }
    public void setCustomer(String customer)
    {
        this.customer=customer;
    }

    public String getItem()
    {
        return item;
    }
    public String getDriver()
    {
        return driver;
    }
    public void setOrderNumber(int orderNumber)
    {
        this.orderNumber=orderNumber;
    }
    public void setItem(String item)
    {
        this.item=item;

    }
    public void setDriver(String driver)
    {
        this.driver=driver;
    }

    @Override
    public String toString() {
        return
                "orderNumber :" + orderNumber +"\n"+
                "item :" + item + "\n" +
                "driver:" + driver + "\n" +
                " customer :" + customer + "\n";
    }
}
