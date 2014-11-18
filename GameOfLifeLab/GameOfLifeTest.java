
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import info.gridworld.actor.Actor;

/**
 * The test class GameOfLifeTest.
 *
 * @author  @gcschmit
 * @version 19 July 2014
 */
public class GameOfLifeTest
{
    /**
     * Default constructor for test class GameOfLifeTest
     */
    public GameOfLifeTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    /**
     * Checks to see if all initial states are correct for a section of the grid.
     */
    @Test
    public void testInitialState()
    {
        /* expected pattern for initial state
         *  (X: alive; -: dead)
         * 
         *    0 1 2 3 4
         *  0 - - X - -
         *  1 X - X - -
         *  2 - X X - -
         *  3 - - - - -
         *  4 - - - - -
         *  
         */

        GameOfLife game = new GameOfLife();
        final int ROWS = game.getNumRows();
        final int COLS = game.getNumCols();

        for(int row = 0; row < 5; row++)
        {
            for(int col = 0; col < 5; col++)
            {
                // in this example, an alive cell has a non-null actor and a dead cell has a null actor
                Actor cell = game.getActor(row, col);

                // if the cell at the current row and col should be alive, assert that the actor is not null
                if(     (row == 0 && col == 2) ||
                (row == 1 && col == 0) ||
                (row == 1 && col == 2) ||
                (row == 2 && col == 1) ||
                (row == 2 && col == 2))
                {
                    assertNotNull("expected alive cell at (" + row + ", " + col + ")", cell);
                }
                else // else, the cell should be dead; assert that the actor is null
                {
                    assertNull("expected dead cell at (" + row + ", " + col + ")", cell);
                }
            }
        }
    }

    /**
     * Tests for all the cell states in the 5x5 corner of the grid after 10 generations.
     */
    @Test
    public void testFinalState()
    {
        /* verify that the actual pattern matches the expected pattern after 3 generations
         *    0 1 2 3 4 5
         *  0 - - - - - -
         *  1 - - - - - -
         *  2 - - - - X -
         *  3 - - - - - X
         *  4 - - - X X X
         *  5 - - - - - -
         */
        
        GameOfLife game = new GameOfLife();
        final int ROWS = game.getNumRows();
        final int COLS = game.getNumCols();
        for(int i = 0; i < 10; i++)
        {
            game.createNextGeneration();
        }
        for(int row = 0; row < 5; row++)
        {
            for(int col = 0; col < 5; col++)
            {
                Actor cell = game.getActor(row, col);
                if(    (row == 2 && col == 4) ||
                (row == 3 && col == 5) ||
                (row == 4 && col == 3) ||
                (row == 4 && col == 4) ||
                (row == 4 && col == 5))
                {
                    assertNotNull("expected alive cell at (" + row + ", " + col + ")", cell);
                }
                else
                {
                    assertNull("expected dead cell at (" + row + ", " + col + ")", cell);
                }
            }
        }
    }
}

