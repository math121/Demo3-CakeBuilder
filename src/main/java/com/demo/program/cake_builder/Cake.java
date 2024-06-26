package com.demo.program.cake_builder;

import com.demo.program.CakeSize;

public class Cake {
    private final CakeSize size;
    private final String flavour;
    private final int layers;
    private boolean frosting;
    private boolean decorations;

    Cake(CakeSize size, String flavour, int layers, boolean frosting, boolean decorations) {
        this.size = size;
        this.flavour = flavour;
        this.layers = layers;
        this.frosting = frosting;
        this.decorations = decorations;
    }

    @Override
    public String toString() {
        return "Cake: " +
                "\nsize = " + size +
                "\nflavour = " + flavour +
                "\nlayers = " + layers +
                "\nfrosting = " + frosting +
                "\ndecorations = " + decorations;
    }

}
