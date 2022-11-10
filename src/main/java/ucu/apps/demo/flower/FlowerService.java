package ucu.apps.demo.flower;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowerService {
    public List <Flower> getFlowers() {
        return List.of(new Flower());
    }
}
