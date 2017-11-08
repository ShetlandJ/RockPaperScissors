package myfirstgame.rockpaperscissors;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by James on 08/11/2017.
 */

public class TestGame {

    Game game;
    Player player;

    @Before
    public void setUp(){
        game = new Game("The House");
        player = new Player("James");
        player.playerChoice(Throw.PAPER);
    }

    @Test
    public void canGetRandomAnswer(){
        Game spy = Mockito.spy(new Game("The House"));
        Mockito.when(spy.getRandomNumber()).thenReturn(0);
        Throw answer = spy.computersRandomSelection();
        Assert.assertEquals("Rock", answer.getThrowName());
    }

    @Test
    public void someoneCanWin(){
        Game spy = Mockito.spy(new Game("The House"));
        Mockito.when(spy.compareHands(player.playersThrow())).thenReturn("Draw");
        String answer = spy.compareHands(player.playersThrow());

        assertEquals("Draw", answer);
    }

}
