package com.demo.program;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class CakeService {

    private ApplicationContext context;

    private List<String> randomFlavours = List.of("Red Velvet", "Strawberry", "Carrot", "Lemon",
            "Ginger", "Raspberry");
    private List<CakeSize> cakeSizes = List.of(CakeSize.values());
    private Random random = new Random();

    public CakeService(ApplicationContext context) {
        this.context = context;
    }

    private CakeBuilder cakeBuilder() {
        return context.getBean(CakeBuilder.class);
    }

    public Cake getCustomCake(String customFlavour) {
        return cakeBuilder().makeMediumSize()
                .setLayers(3)
                .setCustomFlavour(customFlavour)
                .build();
    }

    public Cake getRandomCake() {
        String randomFlavour = randomFlavours.get(random.nextInt(randomFlavours.size()));
        int randomNumber = random.nextInt(1,6);
        CakeSize size = cakeSizes.get(random.nextInt(cakeSizes.size()));

        return cakeBuilder().setSize(size)
                .setLayers(randomNumber)
                .setCustomFlavour(randomFlavour)
                .addFrosting()
                .build();
    }

    public Cake getChocolateCake() {
        return cakeBuilder().makeLargeSize()
                .setLayers(2)
                .useChocolate()
                .addFrosting()
                .addDecorations()
                .build();
    }

    public Cake getVanillaCake() {
        return cakeBuilder().makeLargeSize()
                .setLayers(2)
                .useVanilla()
                .addFrosting()
                .addDecorations()
                .build();
    }
}
