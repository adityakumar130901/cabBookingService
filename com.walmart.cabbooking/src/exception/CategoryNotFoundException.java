package exception;

public class CategoryNotFoundException extends RuntimeException {

    private final String defaultMessage;

    public CategoryNotFoundException(String defaultMessage) {
        this.defaultMessage = defaultMessage;
    }
}
