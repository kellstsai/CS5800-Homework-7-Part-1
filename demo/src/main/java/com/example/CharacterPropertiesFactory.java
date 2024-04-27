package com.example;

import java.util.HashMap;
import java.util.Map;

public class CharacterPropertiesFactory {
    public Map<String, CharacterProperties> map = new HashMap<>();

    public CharacterProperties getCharacterProperties(String font, String color, int size) {
        String key = font + "-" + color + "-" + size;
        if (!map.containsKey(key)) {
            map.put(key, new CharacterProperties(font, color, size));
        }
        return map.get(key);
    }
}