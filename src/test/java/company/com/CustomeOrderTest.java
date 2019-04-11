package company.com;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomeOrderTest {
    CustomeOrder customeOrder = new CustomeOrder();

    @Test
    public void customer()
    {
        System.out.println(customeOrder.getOrder());
    }



}