package io.github.lyes_sefiane.exception_response.entities;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author : Lyes Sefiane
 *
 * @since : 2024-11-21 02:57 PM
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public record ValidationError(String object, String field, Object rejectedValue,
                              String message) implements ErrorResponse {

    public static final class Builder {
        String object;
        String field;
        Object rejectedValue;
        String message;

        public Builder object(String object) {
            this.object = object;
            return this;
        }

        public Builder field(String field) {
            this.field = field;
            return this;
        }

        public Builder rejectedValue(Object rejectedValue) {
            this.rejectedValue = rejectedValue;
            return this;
        }

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public ValidationError build() {
            return new ValidationError(object, field, rejectedValue, message);
        }
    }
}
