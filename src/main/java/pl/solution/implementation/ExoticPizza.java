package pl.solution.implementation;

import pl.solution.api.IPizza;

public class ExoticPizza implements IPizza {
    private int price;
    private String name;

    public ExoticPizza(final int price, final String name) {
        super();
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
