package com.demo.program;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class CakeService {

    private CakeBuilder cakeBuilder;
    private List<String> randomFlavours = List.of("Red Velvet", "Strawberry", "Carrot", "Lemon");
    private Random random = new Random();

    public CakeService(CakeBuilder cakeBuilder) {
        this.cakeBuilder = cakeBuilder;
    }

    public Cake getCustomCake(String customFlavour) {
        return cakeBuilder.makeMediumSize()
                .setLayers(3)
                .setCustomFlavour(customFlavour)
                .build();
    }

    public Cake getRandomCake() {
        String randomFlavour = randomFlavours.get(random.nextInt(randomFlavours.size()));
        int randomNumber = random.nextInt(1,6);
        return cakeBuilder
                .makeSmallSize()
                .setLayers(randomNumber)
                .setCustomFlavour(randomFlavour)
                .build();
    }

    public Cake getChocolateCake() {
        return cakeBuilder.makeLargeSize()
                .setLayers(2)
                .useChocolate()
                .addFrosting()
                .build();
    }

    public Cake getVanillaCake() {
        return cakeBuilder.makeLargeSize()
                .setLayers(2)
                .useVanilla()
                .addFrosting()
                .addDecorations()
                .build();
    }
}
