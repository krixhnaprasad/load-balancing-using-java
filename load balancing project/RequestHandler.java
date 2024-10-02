public class RequestHandler {
    private ServerCache serverCache;

    public RequestHandler(ServerCache serverCache) {
        this.serverCache = serverCache;
    }

    public void handleRequest(String request) {
        String selectedServer = ServerSelector.selectServer(serverCache.getCache());
        System.out.println("Handling request " + request + " on server " + selectedServer);
        // Update the load of the selected server
        int currentLoad = serverCache.getCache().get(selectedServer);
        serverCache.updateLoad(selectedServer, currentLoad + 1);
    }
}
