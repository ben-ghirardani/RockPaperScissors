package com.example.user.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 09/08/2017.
 */

public class GameTest {

    Game game;

    @Before
    public void before() {
        game = new Game();
    }

    @Test
    public void testArray() {
        assertEquals(3, game.countResults());
    }

    @Test
    public void testRandomSelection() {
        assertNotNull(game.getAnswerFromComputer());
    }

}
