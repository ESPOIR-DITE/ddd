package service;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrderNumberTest {
    OrderNumber orderNumber=new OrderNumber();



    @Test
    public void generateOrderNumberArrayList()
    {
        for(int i=0;i<5;i++)
        {

            System.out.println(orderNumber.generateOrderNumberArrayList());

        }
    }
}