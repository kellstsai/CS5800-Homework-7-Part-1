package com.example;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        textEditor.addCharacter('H', "Arial", "Red", 13);
        textEditor.addCharacter('e', "Comic Sans", "Pink", 11);
        textEditor.addCharacter('l', "Arial", "Red", 12);
        textEditor.addCharacter('l', "Arial", "Green", 18);
        textEditor.addCharacter('o', "Arial", "Red", 12);
        textEditor.addCharacter('W', "Calibri", "Yellow", 18);
        textEditor.addCharacter('o', "Calibri", "Purple", 14);
        textEditor.addCharacter('r', "Calibri", "Blue", 21);
        textEditor.addCharacter('l', "Calibri", "Black", 14);
        textEditor.addCharacter('d', "Calibri", "Orange", 11);
        textEditor.addCharacter('C', "Verdana", "Black", 16);
        textEditor.addCharacter('S', "Times New Roman", "Black", 16);
        textEditor.addCharacter('5', "Verdana", "Black", 16);
        textEditor.addCharacter('8', "Verdana", "Black", 16);
        textEditor.addCharacter('0', "Comic Sans", "Purple", 16);
        textEditor.addCharacter('0', "Verdana", "Black", 16);

        textEditor.displayDocument();
        textEditor.saveDocumentToFile("document.txt");
        textEditor.loadDocumentFromFile("document.txt");
    }
}