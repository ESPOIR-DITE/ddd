package company.com;




import static service.Customer.*;

public class CustomeOrder implements OrderBuilder {

    private Order order;


    public CustomeOrder (){
        order = new Order();

    }
    @Override
    public void orderNumber(){
        order.setOrderNumber(95959);// i will need a method that will be producing a random number from 100001 to 99999

    }
    @Override
    public void customer()
    {
        order.setCustomer("charls");       //this method will be taking an object form a class that produce a complet details of a customer
    }
    @Override
    public void item(){

        order.setItem("savana"); //this method will be taking an object form a class that produce a complet details of a customer
    }
    @Override
    public void driver(){
        order.setDriver("charls"); //this method will be taking an object form a class that produce a complet details of a customer

    }
    @Override
    public Order getOrder()
    {
        return order;
    }
}
