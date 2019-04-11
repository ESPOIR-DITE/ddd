package company.com;

public class OrderDirector {
    private OrderBuilder orderBuilder = null;

    public OrderDirector(OrderBuilder orderBuilder)
    {
        this.orderBuilder= orderBuilder;
    }
    public void constructOrder()
    {
        orderBuilder.customer();
        orderBuilder.driver();
        orderBuilder.item();
        orderBuilder.orderNumber();

    }
    public Order getOrder()
    {
        return orderBuilder.getOrder();

    }

}

