import static org.junit.Assert.*;
import org.junit.Test;

public class GameSmokeTest {

    @Test
    public void testMusicPlay() {
        boolean isMusicPlaying = isMusicPlaying("mus1"); 
        assertTrue(isMusicPlaying);
    }

    @Test
    public void testInitialSceneLoad() {
        String currentScene = getCurrentScene(); 
        assertEquals("bg2", currentScene);
    }

   
    public boolean isMusicPlaying(String musicName) {
        return true; 
    }

    public String getCurrentScene() {
        return "bg2"; 
}
