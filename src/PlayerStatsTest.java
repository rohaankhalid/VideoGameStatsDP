import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlayerStatsTest {

    @Test
    public void testSetAndGetStat() {
        PlayerStats stats = new PlayerStats();
        //setting stat called health to value of 100
        stats.setStat("health", 100);

        assertEquals(100, stats.getStat("health"));
    }

    @Test
    public void testUpdateStatValue() {
        PlayerStats stats = new PlayerStats();
        stats.setStat("health", 100);
        stats.setStat("health", 250); //update stat value

        assertEquals(250, stats.getStat("health"));
    }

    @Test
    public void testGetNonExistentStat() {
        PlayerStats stats = new PlayerStats();
        //attempt to get a stat that has not been set
        assertEquals(0, stats.getStat("KD"));
    }
}
