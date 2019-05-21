package exception;

public class BookingNotFoundException extends RuntimeException {

    private final String defaultMessage;

    public BookingNotFoundException(String defaultMessage) {
        this.defaultMessage = defaultMessage;
    }
}
