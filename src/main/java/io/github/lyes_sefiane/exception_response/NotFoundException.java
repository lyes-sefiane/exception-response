package io.github.lyes_sefiane.exception_response;

/**
 * @author : Lyes Sefiane
 *
 * @since : 2024-11-21 03:24 PM
 */
public class NotFoundException extends RuntimeException {

    public NotFoundException() {
        //
    }

    /**
     * Not Found Exception
     *
     * @param message : Exception Custom Message
     */
    public NotFoundException(String message) {
        super(message);
    }

}
