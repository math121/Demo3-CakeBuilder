package com.demo.program;

public class Cake {
    private final CakeSize size;
    private final String flavour;
    private final int layers;

    public Cake(CakeSize size, String flavour, int layers) {
        this.size = size;
        this.flavour = flavour;
        this.layers = layers;
    }

    @Override
    public String toString() {
        return "Cake: " +
                "\nsize = " + size +
                "\nflavour = " + flavour +
                "\nlayers = " + layers;
    }

}
