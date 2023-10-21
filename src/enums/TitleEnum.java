package enums;

import java.time.LocalDateTime;

public enum TitleEnum {
    BIRTHDATE("Enter the flight date (Day/Month/Year): ", LocalDateTime.now()),
    FLIGHT_DATE("Enter the flight date (Day/Month/Year): ", LocalDateTime.now()),
    FLIGHT_TIME("Enter the time (Hour:Minute): ", LocalDateTime.now());
    private final String message;
    private final LocalDateTime statusTime;
    TitleEnum(String status,LocalDateTime statusTime){
        this.message = status;
        this.statusTime = statusTime;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getStatusTime() {
        return statusTime;
    }
}
