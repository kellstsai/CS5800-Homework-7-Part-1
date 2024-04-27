package com.example;

import java.io.Serializable;

public class Character {
    public char character;
    public CharacterProperties properties;

    public Character(char character, CharacterProperties properties) {
        this.character = character;
        this.properties = properties;
    }

    public String display() {
        return "Character: " + character + ", Font: " + properties.getFont() +
                ", Color: " + properties.getColor() + ", Size: " + properties.getSize();
    }
}

