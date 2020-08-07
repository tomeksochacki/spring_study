package pl.solution.implementation;

import pl.solution.api.IOrder;
import pl.solution.api.IPizza;

public class Order implements IOrder {

    private IPizza pizza;

    public Order(IPizza pizza){
        super();
        this.pizza = pizza;
    }
    public void printOrder() {
        System.out.println("Order: " + pizza.getName() + "price: " + pizza.getPrice());
    }
}
