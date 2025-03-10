import static org.junit.Assert.*;
import org.junit.Test;

public class GameSceneTransitionTest {

    @Test
    public void testInitialSceneTransition() {
        String initialScene = getCurrentScene(); // Метод для отримання поточної сцени
        assertEquals("bg2", initialScene);
    }

    @Test
    public void testLibrarySceneTransition() {
        goToLibraryScene(); // Метод для переходу до бібліотеки
        String currentScene = getCurrentScene();
        assertEquals("bg4", currentScene);
    }

    // Ваші методи для переходу між сценами
    public String getCurrentScene() {
        return "bg2"; // Наприклад, повертає поточну сцену
    }

    public void goToLibraryScene() {
        // Логіка для переходу до бібліотеки
    }
}
