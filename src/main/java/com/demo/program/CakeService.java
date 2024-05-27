package com.demo.program;

import org.springframework.stereotype.Service;

@Service
public class CakeService {

    private CakeBuilder cakeBuilder;

    public CakeService(CakeBuilder cakeBuilder) {
        this.cakeBuilder = cakeBuilder;
    }

    public Cake getCustomCake(String customFlavour) {
        return cakeBuilder.makeMediumSize()
                .setLayers(3)
                .setCustomFlavour(customFlavour)
                .build();
    }

    public Cake getChocolateCake() {
        return cakeBuilder.makeLargeSize()
                .setLayers(2)
                .useChocolate()
                .build();
    }

    public Cake getVanillaCake() {
        return cakeBuilder.makeSmallSize()
                .setLayers(2)
                .useVanilla()
                .build();
    }
}
