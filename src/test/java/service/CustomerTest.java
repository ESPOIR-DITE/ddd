package service;

import company.com.OrderBuilder;
import configuration.AppConfig;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class CustomerTest {
    OrderBuilder orderBuilder;
   // Customer customer = new Customer("hugues", "kanda", "0737911620", "40 golnor stree", "abiseben@gmail.com");
    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        orderBuilder = (OrderBuilder) ctx.getBean("oui");


    }
    @Test
    public void toString1() throws Exception
    {
        System.out.println(orderBuilder.getOrder());
    }
}