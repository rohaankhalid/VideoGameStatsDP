import java.util.HashMap;
import java.util.Map;

public class Game {
    private Map<String, PlayerStats> playerStatsMap;

    public Game() {
        playerStatsMap = new HashMap<>();
    }

    public void addPlayer(String username) {
        playerStatsMap.put(username, new PlayerStats());
    }

    public void updatePlayerStats(String username,String statName, int value) {
        PlayerStats stats = playerStatsMap.get(username);
        if (stats != null) {
            stats.setStat(statName, value);
        }
    }

    public int getPlayerStats(String username, String statName) {
        PlayerStats stats = playerStatsMap.get(username);
        if (stats != null) {
            return stats.getStat(statName);
        }
        return 0;
    }

    @Override
    public String toString() {
        return playerStatsMap.toString();
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.addPlayer("TimTheTatMan");
        game.updatePlayerStats("TimTheTatMan", "kills", 22);
        game.updatePlayerStats("TimTheTatMan", "total games won", 120);

        game.addPlayer("Faze Booya");
        game.updatePlayerStats("Faze Booya", "solo games won", 0);

        System.out.println(game);
    }
}
