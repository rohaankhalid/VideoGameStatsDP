import java.util.HashMap;
import java.util.Map;

public class PlayerStats {
    private Map<String, Integer> stats;

    public PlayerStats() {
        stats = new HashMap<>();
    }

    public void setStat(String statName, int value) {
        stats.put(statName, value);
    }

    public int getStat(String statName) {
        return stats.getOrDefault(statName,0);
    }

    @Override
    public String toString() {
        return stats.toString();
    }

    public static void main(String[] args) {
        PlayerStats stats = new PlayerStats();
        stats.setStat("health", 100);
        stats.setStat("shield", 150);
        stats.setStat("strength", 3500);
        System.out.println(stats);
    }
}
