package com.example;

public class RectangularPrism {

    public static int calculate(int height, int width, int length) {
        if (height < 0 || width < 0 || length < 0) {
            throw new IllegalArgumentException("Value must be non negative integers.");
        }
        return height * width * length;
    }
}
