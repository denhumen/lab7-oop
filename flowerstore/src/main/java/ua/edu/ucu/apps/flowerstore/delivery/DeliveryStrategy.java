package ua.edu.ucu.apps.flowerstore.delivery;

import ua.edu.ucu.apps.flowerstore.flowers.Item;

public interface DeliveryStrategy {
    void deliver(Item[] items);
}