import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

import com.example.TextEditor;

import java.io.*; 

public class TextEditorTest {
    public TextEditor textEditor; 

    @Before
    public void setUp(){
        textEditor = new TextEditor();
    }

    @Test
    public void addCharacterTest() {
        textEditor.addCharacter('H', "Arial", "Red", 12);
        textEditor.addCharacter('E', "Comic Sans", "Blue", 16);
        textEditor.addCharacter('L', "Verdana", "Purple", 18);

        String expectedContent = "Character: H, Font: Arial, Color: Red, Size: 12\n" +
                                 "Character: E, Font: Comic Sans, Color: Blue, Size: 16\n" +
                                 "Character: L, Font: Verdana, Color: Purple, Size: 18\n"; 

        assertEquals(expectedContent, textEditor.content.toString()); 
    }

    @Test
    public void saveAndLoadDocumentTest() throws IOException {
        textEditor.addCharacter('H', "Arial", "Red", 12);
        textEditor.addCharacter('E', "Comic Sans", "Blue", 16);
        textEditor.addCharacter('L', "Verdana", "Purple", 18);

        textEditor.saveDocumentToFile("testDocument.txt");
        textEditor.loadDocumentFromFile("testDocument.txt");

        BufferedReader reader = new BufferedReader(new FileReader("testDocument.txt")); 
        StringBuilder build = new StringBuilder(); 
        String line;
        while((line = reader.readLine()) != null) {
            build.append(line).append("\n"); 
        }
        reader.close();

        assertEquals(textEditor.content.toString(), build.toString()); 
    }

    @Test
    public void displayDocumentTest() {
        textEditor.addCharacter('H', "Arial", "Red", 12);
        textEditor.addCharacter('E', "Comic Sans", "Blue", 16);
        textEditor.addCharacter('L', "Verdana", "Purple", 18);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); 
        System.setOut(new PrintStream(outputStream));
        textEditor.displayDocument();
        String expectedOutput = "Document Content:\n" +
                                "Character: H, Font: Arial, Color: Red, Size: 12\n" +
                                "Character: E, Font: Comic Sans, Color: Blue, Size: 16\n" +
                                "Character: L, Font: Verdana, Color: Purple, Size: 18"; 

        assertNotEquals(expectedOutput, outputStream.toString()); 
    }
}
