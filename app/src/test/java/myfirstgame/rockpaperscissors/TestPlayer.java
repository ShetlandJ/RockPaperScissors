package myfirstgame.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by James on 08/11/2017.
 */

public class TestPlayer {

    Player player;

    @Before
    public void setUp() throws Exception {
        player = new Player("James");
    }

    @Test
    public void playerCanPickThrow(){
        player.playerChoice(Throw.ROCK);
        assertEquals(Throw.ROCK, player.playersThrow);
    }
}
