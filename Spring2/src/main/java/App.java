public class App {
    Client client;
    ConsoleEventLogger consoleEventLogger;

    public App(Client client, EventLogger logger){}

    public static void main(String[] args) {

        App app =
    }

    private void logEvent(String msg){
        String message = msg.replaceAll(client.getId(),client.getFullName());
        consoleEventLogger.logEvent(message);
    }
}
