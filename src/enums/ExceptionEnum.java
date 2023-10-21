package enums;

import java.time.LocalDateTime;

public enum ExceptionEnum {
    WRONG_DATE_FORMAT("Wrong date formant! Please enter correct date format. Exp:(Day/Month/Year)", LocalDateTime.now()),
    WRONG_TIME_FORMAT("Wrong time formant! Please enter correct time format. Exp:(Hour:Minute)", LocalDateTime.now()),
    TICKET_LIST_IS_EMPTY("The ticket list is empty! There are no tickets yet", LocalDateTime.now()),
    PASSENGER_LIST_IS_EMPTY("The passengers list is empty! There are no passengers yet", LocalDateTime.now()),
    NOTICE_BOARD_LIST_IS_EMPTY("The notice board is empty!", LocalDateTime.now() ),
    FLIGHT_LIST_IS_EMPTY("The flight list is empty! There are no flights yet", LocalDateTime.now()),
    FLIGHT_NOT_FOUND("The flight not found!", LocalDateTime.now()),
    INVALID_OPTION_EXCEPTION("Wrong option! Please type correct option ", LocalDateTime.now() );
    private final String message;
    private final LocalDateTime exceptionTime;

    ExceptionEnum(String message, LocalDateTime exceptionTime) {
        this.message = message;
        this.exceptionTime = exceptionTime;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getExceptionTime() {
        return exceptionTime;
    }
}
