package ua.edu.ucu.apps.flowerstore.flowers;

import lombok.Getter;
import lombok.Setter;

public abstract class Item {

    @Getter
    @Setter
    private String description;

    public abstract double getPrice();
}