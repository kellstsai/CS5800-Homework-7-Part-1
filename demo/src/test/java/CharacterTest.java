import static org.junit.Assert.assertEquals; 
import org.junit.Test;

import com.example.Character;
import com.example.CharacterProperties; 

public class CharacterTest {
    
    @Test 
    public void CharacterDisplayTest() {
        CharacterProperties properties = new CharacterProperties("Arial", "Black", 14); 
        Character character = new Character('A', properties);

        String expectedDisplay = "Character: A, Font: Arial, Color: Black, Size: 14";
        assertEquals(expectedDisplay, character.display()); 
    }
}
