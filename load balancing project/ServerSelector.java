import java.util.Map;

public class ServerSelector {
    public static String selectServer(Map<String, Integer> cache) {
        String selectedServer = null;
        int minLoad = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : cache.entrySet()) {
            String serverName = entry.getKey();
            int load = entry.getValue();

            if (load < minLoad) {
                minLoad = load;
                selectedServer = serverName;
            }
        }

        return selectedServer;
    }
}
