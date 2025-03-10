import static org.junit.Assert.*;
import org.junit.Test;

public class GameSmokeTest {

    @Test
    public void testMusicPlay() {
        boolean isMusicPlaying = isMusicPlaying("mus1"); // Метод для перевірки відтворення музики
        assertTrue(isMusicPlaying);
    }

    @Test
    public void testInitialSceneLoad() {
        String currentScene = getCurrentScene(); // Метод для отримання поточної сцени
        assertEquals("bg2", currentScene);
    }

    // Ваші методи для перевірки базових функцій
    public boolean isMusicPlaying(String musicName) {
        return true; // Наприклад, завжди повертає true, якщо музика грає
    }

    public String getCurrentScene() {
        return "bg2"; // Наприклад, повертає поточну сцену
    }
}
