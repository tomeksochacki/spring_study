package pl.solution.pizzeria;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.solution.api.IOrder;
import pl.solution.config.Config;
import pl.solution.implementation.ExoticPizza;
import pl.solution.implementation.GoodPizza;
import pl.solution.implementation.Order;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        IOrder order = (IOrder)context.getBean(Order.class);
        order.printOrder();
        /*IOrder order = new Order(new ExoticPizza(17, "Exotic "));
        order.printOrder();*/
    }
}
