import static org.junit.Assert.*;
import org.junit.Test;

public class GameTextTest {

    @Test
    public void testHeroMonologue() {
        String heroText = getHeroMonologue(); // Метод, що повертає текст монолога героя
        assertEquals("Запізно… Зазвичай у цей час у кампусі вже тихо.", heroText);
    }

    @Test
    public void testCatSpeech() {
        String catText = getCatSpeech(); // Метод, що повертає текст кота
        assertEquals("Чого вилупився? Котів не бачив?", catText);
    }

    // Ваші методи для отримання текстів, які будуть використовуватися в тестах
    public String getHeroMonologue() {
        return "Запізно… Зазвичай у цей час у кампусі вже тихо.";
    }

    public String getCatSpeech() {
        return "Чого вилупився? Котів не бачив?";
    }
}

