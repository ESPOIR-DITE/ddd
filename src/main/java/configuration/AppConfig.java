package configuration;

import company.com.CustomeOrder;
import company.com.OrderBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name="oui")
    public OrderBuilder getService()
    {
        return new CustomeOrder();
    }




}
