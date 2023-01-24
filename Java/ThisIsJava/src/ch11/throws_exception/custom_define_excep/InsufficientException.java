package ch11.throws_exception.custom_define_excep;


public class InsufficientException extends Exception{
    public InsufficientException() {
    }

    public InsufficientException(String message) {
        super(message);
    }

}
