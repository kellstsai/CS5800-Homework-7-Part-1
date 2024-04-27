import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

import com.example.CharacterProperties;
import com.example.CharacterPropertiesFactory;

public class CharacterPropertiesFactoryTest {
    
    @Test
    public void CharacterPropertiesFactoryTestTest() {
        CharacterPropertiesFactory factory = new CharacterPropertiesFactory(); 
        CharacterProperties properties1 = factory.getCharacterProperties("Arial", "Black", 12); 
        CharacterProperties properties2 = factory.getCharacterProperties("Arial", "Black", 12); 
        CharacterProperties properties3 = factory.getCharacterProperties("Arial", "Pink", 12); 

        assertNotNull(properties1); 
        assertNotNull(properties2);
        assertNotNull(properties3);

        assertEquals(properties1, properties2);
        assertEquals(false, properties1.equals(properties3));
    }
}
