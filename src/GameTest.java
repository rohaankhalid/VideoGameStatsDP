import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GameTest {
    
    @Test
    public void testPlayerStatUpdates() {
        Game game = new Game();
        //adding barbarian as a username
        game.addPlayer("barbarian");
        //the player barbairan has a stat called health which has a value of 250
        game.updatePlayerStats("barbarian", "health", 250);

        assertEquals(250, game.getPlayerStats("barbarian", "health"));
    }

    @Test
    public void testNonExistentPlayer() {
        Game game = new Game();
        //rkhalid below is a nonexistent username since I have not added it as a player to the game
        //return value is default which is 0
        assertEquals(0, game.getPlayerStats("rkhalid", "health"));
    }

    @Test
    public void testNonExistentStat() {
        Game game = new Game();
        //adding OsamaBeenLaggin as a username
        game.addPlayer("OsamaBeenLaggin");
        //OsamaBeenLaggin has a stat called kills which has a value of 20
        game.updatePlayerStats("OsamaBeenLaggin", "kills", 20);

        //getPlayerStats is called on statName "intelligence" which does not exists for this username
        //return value is default which is 0
        assertEquals(0, game.getPlayerStats("OsamaBinLaggin", "intelligence"));
    }
}
