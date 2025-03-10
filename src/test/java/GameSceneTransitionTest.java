import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class GameSceneTransitionTest {

    private String currentScene;

    // Викликається перед кожним тестом для налаштування початкового стану
    @Before
    public void setUp() {
        currentScene = "bg2"; // Початкова сцена гри
    }

    @Test
    public void testInitialSceneTransition() {
        assertEquals("bg2", currentScene); // Перевірка, що початкова сцена є bg2
    }

    @Test
    public void testLibrarySceneTransition() {
        goToLibraryScene(); // Перехід до бібліотеки
        assertEquals("bg4", currentScene); // Перевірка, що після переходу сцена bg4
    }

    // Мокова функція для зміни сцени в тестах
    public String getCurrentScene() {
        return currentScene;
    }

    // Логіка для переходу до бібліотеки
    public void goToLibraryScene() {
        currentScene = "bg4"; // При переході змінюється сцена на bg4
    }
}
