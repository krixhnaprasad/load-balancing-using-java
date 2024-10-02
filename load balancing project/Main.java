public class Main {
    public static void main(String[] args) {
        ServerCache serverCache = new ServerCache();
        serverCache.addServer("Server 1", 9);
        serverCache.addServer("Server 2", 20);
        serverCache.addServer("Server 3", 10);

        RequestHandler requestHandler = new RequestHandler(serverCache);

        requestHandler.handleRequest("Request 1");
        requestHandler.handleRequest("Request 2");
        requestHandler.handleRequest("Request 3");

        // Display updated cache
        System.out.println("Updated server loads: " + serverCache.getCache());
    }
}
