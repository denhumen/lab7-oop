package ua.edu.ucu.apps.flowerstore.flowers.decorators;

import ua.edu.ucu.apps.flowerstore.flowers.Item;

public class KibbonDecorator extends ItemDecorator {

    public Item item;

    public String getDescription() {
        return "Description";
    }

    public double getPrice() {
        return 0;
    }
    
}
