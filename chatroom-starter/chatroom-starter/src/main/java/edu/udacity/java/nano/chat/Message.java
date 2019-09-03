package edu.udacity.java.nano.chat;

/**
 * WebSocket message model
 */
public class Message {
    // TODO: add message model.
    private String usernmame;
    private String type;
    private String message;
    private int onlineCount;

    public Message(){}

    public Message(String message) {
        this.message = message;
    }

    public Message(String usernmame, String type, String message) {
        this.usernmame = usernmame;
        this.type = type;
        this.message = message;
    }

    public int getOnlineCount() {
        return onlineCount;
    }

    public void setOnlineCount(int onlineCount) {
        this.onlineCount = onlineCount;
    }

    public String getUsernmame() {
        return usernmame;
    }

    public void setUsernmame(String usernmame) {
        this.usernmame = usernmame;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
