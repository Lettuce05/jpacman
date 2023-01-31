package nl.tudelft.jpacman.level;
import static org.assertj.core.api.Assertions.assertThat;
import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.Test;

public class PlayerTest {

    private static final PacManSprites PAC_MAN_SPRITES = new PacManSprites();
    private PlayerFactory playerFactory = new PlayerFactory(PAC_MAN_SPRITES);
    private Player player = playerFactory.createPacMan();
    @Test
    void testIsAlive() {
        assertThat(player.isAlive()).isEqualTo(true);
    }

    @Test
    void testGetScore() {
        int testValue = 5;
        int oldPlayerScore = player.getScore();
        player.addPoints(testValue);
        assertThat(player.getScore()).isEqualTo(oldPlayerScore+testValue);
    }


}
