import static org.junit.Assert.*;
import org.junit.Test;

public class GameTextTest {

    @Test
    public void testHeroMonologue() {
        String heroText = getHeroMonologue();
        assertEquals("Запізно… Зазвичай у цей час у кампусі вже тихо.", heroText);
    }

    @Test
    public void testCatSpeech() {
        String catText = getCatSpeech();
        assertEquals("Чого вилупився? Котів не бачив?", catText);
    }

    
    public String getHeroMonologue() {
        return "Запізно… Зазвичай у цей час у кампусі вже тихо.";
    }

    public String getCatSpeech() {
        return "Чого вилупився? Котів не бачив?";
    }
}

