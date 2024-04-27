package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TextEditor {
    public StringBuilder content = new StringBuilder();
    public CharacterPropertiesFactory propertiesFactory = new CharacterPropertiesFactory();

    public void addCharacter(char value, String font, String color, int size) {
        CharacterProperties properties = propertiesFactory.getCharacterProperties(font, color, size);
        Character character = new Character(value, properties);
        content.append(character.display()).append("\n");
    }

    public void saveDocumentToFile(String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content.toString());
            System.out.println("Document saved to file: " + fileName);
        } catch (IOException e) {
            System.err.println("Error occurred while saving document to file: " + e.getMessage());
        }
    }

    public void loadDocumentFromFile(String fileName) {
        System.out.println("Document loaded from file: " + fileName);
    }

    public void displayDocument() {
        System.out.println("Document Content:");
        System.out.println(content.toString());
    }
}
