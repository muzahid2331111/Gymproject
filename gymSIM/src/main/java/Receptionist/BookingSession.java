package Receptionist;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class BookingSession {
    private final StringProperty sessionID;
    private final StringProperty time;
    private final StringProperty status;

    public BookingSession(StringProperty sessionID, StringProperty time, StringProperty status) {
        this.sessionID = sessionID;
        this.time = time;
        this.status = status;
    }

    public String getSessionID() {
        return sessionID.get();
    }

    public StringProperty sessionIDProperty() {
        return sessionID;
    }

    public String getTime() {
        return time.get();
    }

    public StringProperty timeProperty() {
        return time;
    }

    public String getStatus() {
        return status.get();
    }

    public StringProperty statusProperty() {
        return status;
    }
}
