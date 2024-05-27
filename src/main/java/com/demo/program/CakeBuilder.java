package com.demo.program;

import org.springframework.stereotype.Component;

@Component
public class CakeBuilder {
    private CakeSize size;
    private String flavour;
    private int layers;

    public CakeBuilder useVanilla() {
        flavour = "vanilla";
        return this;
    }

    public CakeBuilder useChocolate() {
        flavour = "chocolate";
        return this;
    }

    public CakeBuilder makeMediumSize() {
        size = CakeSize.MEDIUM;
        return this;
    }

    public CakeBuilder makeLargeSize() {
        size = CakeSize.LARGE;
        return this;
    }

    public CakeBuilder makeSmallSize() {
        size = CakeSize.SMALL;
        return this;
    }

    public CakeBuilder setLayers(int layers) {
        this.layers = layers;
        return this;
    }

    public CakeBuilder setCustomFlavour(String flavour) {
        this.flavour = flavour;
        return this;
    }

    public Cake build() {
        return new Cake(size, flavour, layers);
    }
}
