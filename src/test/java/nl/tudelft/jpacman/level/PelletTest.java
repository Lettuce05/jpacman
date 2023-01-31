package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.sprite.PacManSprites;
import nl.tudelft.jpacman.sprite.Sprite;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class PelletTest {
    private static final Sprite PELLET_SPRITE = new PacManSprites().getPelletSprite();
    private static final int TEST_POINT_VALUE = 10;
    private Pellet pellet = new Pellet(TEST_POINT_VALUE, PELLET_SPRITE);
    @Test
    void testGetValue() {
        assertThat(pellet.getValue()).isEqualTo(TEST_POINT_VALUE);
    }
}
