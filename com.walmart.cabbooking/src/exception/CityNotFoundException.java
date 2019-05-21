package exception;

public class CityNotFoundException extends RuntimeException {

    private final String defaultMessage;

    public CityNotFoundException(String defaultMessage) {
        this.defaultMessage = defaultMessage;
    }
}
