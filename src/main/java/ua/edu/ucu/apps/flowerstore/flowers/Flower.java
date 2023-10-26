package ua.edu.ucu.apps.flowerstore.flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Flower {
    private Integer id;
    private FlowerColor color;
    private double price;
    private double sepalLength;
}
