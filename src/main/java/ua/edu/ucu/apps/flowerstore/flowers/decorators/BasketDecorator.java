package ua.edu.ucu.apps.flowerstore.flowers.decorators;

import ua.edu.ucu.apps.flowerstore.flowers.Item;

public class BasketDecorator extends ItemDecorator {

    public Item item;

    @Override
    public String getDescription() {
        return "Description";
    }

    @Override
    public double getPrice() {
        return 0;
    }
    
}
