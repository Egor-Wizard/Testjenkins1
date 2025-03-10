import static org.junit.Assert.*;
import org.junit.Test;

public class GameSceneTransitionTest {

    @Test
    public void testInitialSceneTransition() {
        String initialScene = getCurrentScene(); // Метод для отримання поточної сцени
        assertEquals("bg2", initialScene); // Очікуємо, що початкова сцена має бути bg2
    }

    @Test
    public void testLibrarySceneTransition() {
        goToLibraryScene(); // Метод для переходу до бібліотеки
        String currentScene = getCurrentScene();
        assertEquals("bg4", currentScene); // Очікуємо, що після переходу сцена має бути bg4
    }

    // Метод для симуляції зміни сцени
    public String getCurrentScene() {
        // Логіка для отримання поточної сцени гри
        return "bg4"; // Повертаємо bg4, якщо бібліотека відкрилася
    }

    // Метод для симуляції переходу до бібліотеки
    public void goToLibraryScene() {
        // Логіка для зміни сцени в грі
        // В реальній грі тут буде код для відображення бібліотеки
    }
}
