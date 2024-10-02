import java.util.HashMap;
import java.util.Map;

public class ServerCache {
    private Map<String, Integer> cache;

    public ServerCache() {
        cache = new HashMap<>();
    }

    public void addServer(String serverName, int load) {
        cache.put(serverName, load);
    }

    public void updateLoad(String serverName, int load) {
        cache.put(serverName, load);
    }

    public Map<String, Integer> getCache() {
        return cache;
    }
}

