package company.com;

public class DriverClass {
    public static void main(String[] args) {
        OrderBuilder orderBuilder = new CustomeOrder();
        OrderDirector orderDirector= new OrderDirector(orderBuilder);
        orderDirector.constructOrder();
        Order order=orderDirector.getOrder();
        System.out.println("order is:\n"+order);
    }
}
//I think i should build builderPartens for each class in this program that will be supplying all the neccesary information to the methods: setCustomer, setItem()...