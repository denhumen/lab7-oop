package ua.edu.ucu.apps.flowerstore;

import java.util.List;

import org.springframework.stereotype.Service;

import ua.edu.ucu.apps.flowerstore.flowers.Flower;
import ua.edu.ucu.apps.flowerstore.flowers.FlowerColor;

@Service
public class FlowerService {
    public List<Flower> getGlowers(){
        return List.of(new Flower(1, FlowerColor.RED, 20, 0.8));
    }
}
