package ua.edu.ucu.apps.flowerstore.delivery;

import org.springframework.stereotype.Service;

import ua.edu.ucu.apps.flowerstore.flowers.Item;

@Service
public class DHLDeliveryStrategy implements DeliveryStrategy {

    @Override
    public void deliver(Item[] items) {
        System.out.println("Delivering...");
    }

}
