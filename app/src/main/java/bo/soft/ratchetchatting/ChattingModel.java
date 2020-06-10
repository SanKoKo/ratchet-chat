package bo.soft.ratchetchatting;

public class ChattingModel {
    boolean byServer;
    String message;

    public ChattingModel(boolean byServer, String message) {
        this.byServer = byServer;
        this.message = message;
    }

    public boolean isByServer() {
        return byServer;
    }

    public String getMessage() {
        return message;
    }
}
