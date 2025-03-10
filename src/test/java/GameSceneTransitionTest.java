import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class GameSceneTransitionTest {

    private String currentScene;

  
    @Before
    public void setUp() {
        currentScene = "bg2"; 
    }

    @Test
    public void testInitialSceneTransition() {
        assertEquals("bg2", currentScene); 
    }

    @Test
    public void testLibrarySceneTransition() {
        goToLibraryScene(); 
        assertEquals("bg4", currentScene); 
    }

   
    public String getCurrentScene() {
        return currentScene;
    }

  
    public void goToLibraryScene() {
        currentScene = "bg4"; 
    }
}
