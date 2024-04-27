import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.example.CharacterProperties; 

public class CharacterPropertiesTest {
    
    @Test
    public void CharacterPropertiesConstructor() {
        CharacterProperties properties = new CharacterProperties("Arial", "Red", 14);

        assertEquals("Arial", properties.getFont());
        assertEquals("Red", properties.getColor());
        assertEquals(14, properties.getSize()); 
    }

    @Test
    public void toStringTest() {
        CharacterProperties properties = new CharacterProperties("Calibri", "Blue", 16);

        String expectedString = "Font: Calibri, Color: Blue, Size: 16";
        assertEquals(expectedString, properties.toString()); 
    }

    @Test
    public void getFontTest() {
        CharacterProperties properties = new CharacterProperties("Verdana", "Black", 12);

        assertEquals("Verdana", properties.getFont()); 
    }

    @Test
    public void getColorTest() {
        CharacterProperties properties = new CharacterProperties("Verdana", "Black", 12);

        assertEquals("Black", properties.getColor());
    }

    @Test
    public void getSizeTest() {
        CharacterProperties properties = new CharacterProperties("Verdana", "Black", 12);

        assertEquals(12, properties.getSize());
    }
}
