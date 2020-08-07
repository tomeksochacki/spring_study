package pl.solution.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.solution.api.IOrder;
import pl.solution.api.IPizza;
import pl.solution.implementation.ExoticPizza;
import pl.solution.implementation.GoodPizza;
import pl.solution.implementation.Order;

@Configuration
public class Config {
    @Bean
    public IPizza pizza(){
        return new ExoticPizza(17, "Exotic ");
    }
    @Bean(name = "other")
    public IOrder order(IPizza pizza){
        return new Order(pizza);
    }
}
