package ua.edu.ucu.apps.flowerstore.flowers.decorators;

import ua.edu.ucu.apps.flowerstore.flowers.Item;

public class PaperDecorator extends ItemDecorator {

    public Item item;

    @Override
    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    @Override
    public double getPrice() {
        throw new UnsupportedOperationException();
    }
    
}
