package com.example;

import java.io.*;
import java.util.HashMap;

public class CharacterProperties {
    String font; 
    String color; 
    int size; 

    public CharacterProperties(String font, String color, int size) {
        this.font = font;
        this.color = color;
        this.size = size; 
    }

    @Override
    public String toString() {
        return "Font: " + font + ", Color: " + color + ", Size: " + size; 
    }

    public String getFont() {
        return font; 
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size; 
    }
}
