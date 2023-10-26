package ua.edu.ucu.apps.flowerstore.flowers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flower")
public class FlowerstoreApplicationController {

    @GetMapping("/list")
    public List<Flower> list(){
        Flower fl1 = new Flower(1, FlowerColor.RED, 10.2, 10.1);
        return List.of(fl1);
    }

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

}
