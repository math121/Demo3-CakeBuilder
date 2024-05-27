package com.demo.program.cake_builder;

import com.demo.program.CakeSize;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CakeBuilder {
    private CakeSize size;
    private String flavour;
    private int layers;
    private boolean frosting = false;
    private boolean decorations = false;

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

    public CakeBuilder setSize(CakeSize size) {
        this.size = size;
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

    public CakeBuilder addFrosting() {
        frosting = true;
        return this;
    }

    public CakeBuilder addDecorations() {
        decorations = true;
        return this;
    }

    public Cake build() {
        return new Cake(size, flavour, layers, frosting, decorations);
    }
}
