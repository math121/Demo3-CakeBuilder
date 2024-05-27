package com.demo.program;

public enum CakeSize {
    LARGE('L'),
    SMALL('S'),
    MEDIUM('M');

    private char size;

    CakeSize(char size) {
        this.size = size;
    }
}
